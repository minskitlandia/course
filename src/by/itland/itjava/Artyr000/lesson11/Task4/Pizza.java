package by.itland.itjava.Artyr000.lesson11.Task4;

import by.itland.itjava.Artyr000.lesson11.Task3.Rect;

public class Pizza extends Recipes {
    private String ingredients;
    private String recept;

    @Override
    public void showIngredients() {

    }

    @Override
    public void showRecipe() {

    }

    public Pizza(String name, boolean type, String ingredients, String recept) {
        super(name, type);
        this.ingredients = ingredients;
        this.recept = recept;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredients='" + ingredients + '\'' +
                ", recept='" + recept + '\'' +
                '}';
    }
}
