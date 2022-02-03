package by.itland.itjava.davydovskikh.less11.recipes;

public class Salad extends Recipes {
    private String saladIngredients;
    private String saladRecipe;

    public Salad() {
    }

    @Override
    public void showIngredients() {
        System.out.println("классный салат");
    }

    @Override
    public void showRecipe() {
        System.out.println("с любовь DaLuVe<3");
    }

    public Salad(String name, String type, String saladIngredients, String saladRecipe) {
        super(name, type);
        this.saladIngredients = saladIngredients;
        this.saladRecipe = saladRecipe;
    }

    public String getSaladIngredients() {
        return saladIngredients;
    }

    public void setSaladIngredients(String saladIngredients) {
        this.saladIngredients = saladIngredients;
    }

    public String getSaladRecipe() {
        return saladRecipe;
    }

    public void setSaladRecipe(String saladRecipe) {
        this.saladRecipe = saladRecipe;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name: " + getName() +
                ", type: " + getType() +
                ", ingredients: " + saladIngredients +
                ", recipe: " + saladRecipe +
                '}';
    }
}