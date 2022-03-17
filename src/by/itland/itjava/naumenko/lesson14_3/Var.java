package by.itland.itjava.naumenko.lesson14_3;

import java.util.Random;

public abstract class Var implements Operation {

    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("ERROR: сложение " + this.getClass().getSimpleName() + " невозможна с " +
                other.getClass().getSimpleName());
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("ERROR: разность " + this.getClass().getSimpleName() + " невозможна с " +
                other.getClass().getSimpleName());
    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("ERROR: произведение " + this.getClass().getSimpleName() + " невозможна с " +
                other.getClass().getSimpleName());
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("ERROR: частное " + this.getClass().getSimpleName() + " невозможна с " +
                other.getClass().getSimpleName());
    }


    public static Var createVar(String operand) throws CalcException {
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        else if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        else if (operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        throw new CalcException();
    }

    @Override
    public String toString() {
        return "Я Var";
    }
}
