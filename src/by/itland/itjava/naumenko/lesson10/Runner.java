package by.itland.itjava.naumenko.lesson10;

<<<<<<< HEAD
import java.time.Year;
import java.util.Calendar;

=======
>>>>>>> f9147c2 (lesson010.naumenko)
public class Runner {

    public static void main(String[] args) {


<<<<<<< HEAD
        System.out.println(Year.now().getValue());
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));


        Roll roll = new Roll(18, 342);
        System.out.println(roll.percentage());
        System.out.println(roll.sumDenominator());
        System.out.println(roll.checkSimpleNumerator());
        roll.reduce();
        roll.getDenominator();
        roll.getNumerator();

        System.out.println(roll);



=======
//        Point left = new Point(-5, 3);
//        Point right = new Point(3, 4);
//
//        Rectangle rectangle = new Rectangle(left, right);
//        System.out.println(rectangle.checkSquare());
//        rectangle.draw();

        ComplexNumber complexNumber = new ComplexNumber(5, 2);
        System.out.println(complexNumber);
        System.out.printf("%.2f\n", complexNumber.abs());
        complexNumber.updateReal(-2);
        complexNumber.updateIm(3);
        System.out.println(complexNumber);
>>>>>>> f9147c2 (lesson010.naumenko)
    }
}
