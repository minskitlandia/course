package by.itland.itjava.timshina.lesson11.Recipes;

public class Porridge extends Recipes{
    private String porridgeIngredients;
    private String porridgeRecipe;

    public Porridge() {
    }
    @Override
    public void showIngredients(){
        System.out.println("очень вкусно");
    }
    @Override
    public void showRecipe(){
        System.out.println("реально вкусно");
    }

    public Porridge(String name, String type, String porridgeIngredients, String porridgeRecipe) {
        super(name, type);
        this.porridgeIngredients = porridgeIngredients;
        this.porridgeRecipe = porridgeRecipe;
    }

    public String getPorridgeIngredients() {
        return porridgeIngredients;
    }

    public void setPorridgeIngredients(String porridgeIngredients) {
        this.porridgeIngredients = porridgeIngredients;
    }

    public String getPorridgeRecipe() {
        return porridgeRecipe;
    }

    public void setPorridgeRecipe(String porridgeRecipe) {
        this.porridgeRecipe = porridgeRecipe;
    }

    @Override
    public String toString() {
        return "Porridge{" +
                "name: " + getName() +
                ", type: " + getType() +
                ", ingredients: " + porridgeIngredients +
                ", recipe: " + porridgeRecipe +
                '}';
    }
}
