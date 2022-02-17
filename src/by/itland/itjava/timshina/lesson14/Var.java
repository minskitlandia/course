package by.itland.itjava.timshina.lesson14;

public abstract class Var implements Operation{
    @Override
    public Var add(Var other) {
        System.out.println("Error: сложение " + this.getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Error: вычитание " + getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Error: умножение " + getClass().getSimpleName() + " невозможно с " +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Error деление " + getClass().getSimpleName() + " невозможно с "  +
                other.getClass().getSimpleName());
        return null;
    }

    @Override
    public String toString() {
        return "i'm var";
    }
}
