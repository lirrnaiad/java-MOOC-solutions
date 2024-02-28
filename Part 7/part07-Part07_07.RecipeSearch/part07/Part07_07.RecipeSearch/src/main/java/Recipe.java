import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.recipeName = name;
        this.cookingTime = time;
        this.ingredients = new ArrayList<>();
    }
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.recipeName = name;
        this.cookingTime = time;
        this.ingredients = ingredients;
    }

    public String toString() {
        return recipeName + ", cooking time: " + cookingTime;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
}