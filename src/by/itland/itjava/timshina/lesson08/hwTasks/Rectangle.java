package by.itland.itjava.timshina.lesson08.hwTasks;

public class Rectangle {
    int x1;
    int y1;


    public Rectangle(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;

    }

    private double distance (Rectangle other){
        return Math.sqrt(Math.pow(other.x1-this.x1, 2)+Math.pow(other.y1-this.y1, 2));
    }
    private double square (Rectangle other){
        return Math.abs(other.x1-this.x1)*Math.abs(other.y1-this.y1);
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        /*System.out.println("диагональ: " + a.distance(b));
        System.out.println("площадь: " + a.square(b);*/
    }

}
