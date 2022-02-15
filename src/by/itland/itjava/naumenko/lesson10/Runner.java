package by.itland.itjava.naumenko.lesson10;

import java.time.Year;
import java.util.Calendar;

public class Runner {

    public static void main(String[] args) {


//        System.out.println(Year.now().getValue());
//        System.out.println(Calendar.getInstance().get(Calendar.YEAR));


        Roll roll = new Roll(18, 342);
        System.out.println(roll.percentage());
        System.out.println(roll.sumDenominator());
        System.out.println(roll.checkSimpleNumerator());
        roll.reduce();
        roll.getDenominator();
        roll.getNumerator();

        System.out.println(roll);





    }
}
