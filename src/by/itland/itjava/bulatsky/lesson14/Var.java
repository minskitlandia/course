package by.itland.itjava.bulatsky.lesson14;

public abstract class Var implements Operation{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Var add(Var other) {
        System.out.println("ERROR");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("ERROR");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("ERROR");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("ERROR");
        return null;
    }

    @Override
    public String toString() {
        return "Я Var";
    }

}
