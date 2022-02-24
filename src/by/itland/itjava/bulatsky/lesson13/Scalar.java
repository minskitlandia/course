package by.itland.itjava.bulatsky.lesson13;

public class Scalar extends Var {

    private double value;

    public Scalar(double value){
        this.value = value;
    }


    public Scalar(String value){
        this.value = Double.parseDouble(value);
    }

    public Scalar(Scalar scalar){
        this.value = scalar.value;
    }


    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}


