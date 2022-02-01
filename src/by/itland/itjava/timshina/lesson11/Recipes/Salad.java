package by.itland.itjava.timshina.lesson11.Recipes;

public class Salad extends Recipes{
    private String saladIngredients;
    private String saladRecipe;

    public Salad() {
    }
    @Override
    public void showIngredients(){
        System.out.println("очень вкусно");
    }
    @Override
    public void showRecipe(){
        System.out.println("реально вкусно");
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
