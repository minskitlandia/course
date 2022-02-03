package by.itland.itjava.bulatsky.lesson10;

public class ComplexNumber {

    private int real;
    private int im;

    public ComplexNumber(int real,int im){
        this.real = real;
        this.im = im;
    }

    public int getReal() {
        return real;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getIm() {
        return im;
    }
    public double abs() {
        return Math.sqrt(real*real+im*im);
    }
    public void updateReal(int real){
        this.real += real;
    }
    public void updateIm(int im){
        this.im += im;
    }
}
