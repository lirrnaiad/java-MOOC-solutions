import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void readRecipesFromFile(String filename) {
        try (Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNextLine()) {
                String name = file.nextLine();
                int time = Integer.valueOf(file.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while(file.hasNextLine()) {
                    String ingredient = file.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, time, ingredients);
                this.recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println();
    }

    public void searchName(String keyword) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().contains(keyword)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void searchCookingTime(int maxTime) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void searchIngredient(String ingredient) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            for (int i = 0; i < recipe.getIngredients().size(); i++) {
                if (recipe.getIngredients().get(i).equals(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }
        System.out.println();
    }
}
