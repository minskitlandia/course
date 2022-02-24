package by.itland.itjava.Artyr000.lesson11.Task4;

public class Salad extends Recipes{
    private String ingredients;
    private String recept;

    @Override
    public void showIngredients() {

    }

    @Override
    public void showRecipe() {

    }

    public Salad(String name, boolean type, String ingredients, String recept) {
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
        return "Salad{" +
                "ingredients='" + ingredients + '\'' +
                ", recept='" + recept + '\'' +
                '}';
    }
}
