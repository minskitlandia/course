package by.itland.itjava.timshina.lesson11.Recipes;

public abstract class Recipes {
    private String name;
    private String type;

    public abstract void showIngredients();

    public abstract void showRecipe();

    public Recipes() {
    }

    public Recipes(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "name='" + name +
                ", type='" + type +
                '}';
    }
}
