package by.itland.itjava.bulatsky.lesson10;

public class Runner {

    Point a= new Point(0,0);
    Point b= new Point(5,0);
    Point c= new Point(2,7);
    Triangle triangle = new Triangle(a,b,c);


    public static void main(String[] args) {
//
//        Point a= new Point(0,0);
//        Point b= new Point(5,0);
//        Point c= new Point(2,7);
//        Triangle triangle = new Triangle(a,b,c);
//        System.out.printf("Perimeter %.2f \n",triangle.perimetr());
//        System.out.printf("Square %.2f \n",triangle.Square());

//        Point left = new Point(0,0);
//        Point right = new Point(3,3);
//        Rectangle rectangle = new Rectangle(left, right);
//        System.out.println(rectangle.checkSquare());
//        rectangle.draw();
//    }

        Book book = new Book(90, "Маленький принц", 15.5, 2005);
        System.out.println(book.getPrice());
        book.UpdatePrice();
        System.out.println(book.getPrice());
    }
}
