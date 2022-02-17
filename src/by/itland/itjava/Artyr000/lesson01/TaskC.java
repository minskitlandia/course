package by.itland.itjava.Artyr000.lesson01;


public class TaskC {
    public static void main(String[] args) {
        example1(1,-10);
        example2();
        example3(2,2,5);
        }

    public static void example1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    public static void example2(){
        double a = Math.pow(5, 15) - (Math.pow(7, 10) * Math.cos(90)) +(Math.sin(25)* Math.abs(Math.pow(-5, 15)));
        System.out.println(a);
    }

    public static void example3(int a, int b, int c) {
        double d = (a + b) / (double) c;
        System.out.println(d);
    }

}
