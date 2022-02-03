package by.itland.itjava.davydovskikh.less11.recipes;

public class Porridge extends Recipes {
    private String porridgeIngredients;
    private String porridgeRecipe;

    public Porridge() {
    }

    @Override
    public void showIngredients() {
        System.out.println("заказывайте пиццу тодько у нас");
    }

    @Override
    public void showRecipe() {
        System.out.println("ваш DaLuVe <3");
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

