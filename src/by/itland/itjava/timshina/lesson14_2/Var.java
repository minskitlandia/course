package by.itland.itjava.timshina.lesson14_2;

public abstract class Var implements Operation {
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

    public static Var createVar(String operand){
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        else if (operand.matches(Patterns.VECTOR)){
            return new Vector(operand);
        }
        else if (operand.matches(Patterns.MATRIX)){
            return new Matrix(operand);
        }


        else return null;
    }


    @Override
    public String toString() {
        return "i'm var";
    }
}
