package by.itland.itjava.Artyr000.lesson11.Task4;

public abstract class Recipes {
    private String name;
    private boolean type;

    public abstract void showIngredients();
    public abstract void showRecipe();

    public Recipes() {
    }

    public Recipes(String name, boolean type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "name=" + name +
                ", type=" + type +
                '}';
    }
}
