package by.itland.itjava.bulatsky.lesson14;

public abstract class Var implements Operation{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Var add(Var other) {
        System.out.println("ERROR: сложение " + this.getClass().getSimpleName() + " невозможно с " + other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("ERROR: вычитание " + this.getClass().getSimpleName() + " невозможно с " + other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("ERROR: произведение " + this.getClass().getSimpleName() + " невозможно с " + other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("ERROR: частное " + this.getClass().getSimpleName() + " невозможно с " + other.getClass().getSimpleName());
        return null;
    }

    @Override
    public String toString() {
        return "Я Var";
    }

}
