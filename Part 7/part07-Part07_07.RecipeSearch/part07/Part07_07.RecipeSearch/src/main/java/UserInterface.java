import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    private RecipeList recipeList;


    public UserInterface (Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        System.out.println();

        // Read file and populate the recipe list
        recipeList.readRecipesFromFile(filename);

        printCommands();

        // Command loop
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipeList.printRecipes();
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String keyword = scanner.nextLine();
                recipeList.searchName(keyword);
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                recipeList.searchCookingTime(maxTime);
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeList.searchIngredient(ingredient);
            }
        }

    }

    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
    }
}