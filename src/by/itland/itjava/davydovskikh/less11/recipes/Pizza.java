package by.itland.itjava.davydovskikh.less11.recipes;

public class Pizza extends Recipes{
    private String pizzaIngredients;
    private String pizzaRecipe;

    public Pizza() {
    }
    @Override
    public void showIngredients(){
        System.out.println("пицца классная");
    }
    @Override
    public void showRecipe(){
        System.out.println("ваш DaLuVe<3");
    }

    public Pizza(String name, String type, String pizzaIngredients, String pizzaRecipe) {
        super(name, type);
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaRecipe = pizzaRecipe;
    }

    public String getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public String getPizzaRecipe() {
        return pizzaRecipe;
    }

    public void setPizzaRecipe(String pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name: " + getName() +
                ", type: " + getType() +
                ", ingredients: " + pizzaIngredients +
                ", recipe: " + pizzaRecipe +
                '}';
    }
}