package by.itland.itjava.drobyazko.lesson03;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= 0 && b >= 0 && a <= 10 && b <= 10) {
            if (a == 0 && b == 0)
                System.out.println("ноль умножить на ноль равно ноль");
            else if (a == 0 && b == 1)
                System.out.println("ноль умножить на один равно ноль");
            else if (a == 0 && b == 2 )
                System.out.println("ноль умножить на два равно ноль");
            else if (a == 0 && b == 3)
                System.out.println("ноль умножить на три равно ноль");
            else if (a == 0 && b == 4 )
                System.out.println("ноль умножить на четыре равно ноль");
            else if (a == 0 && b == 5)
                System.out.println("ноль умножить на пять равно ноль");
            else if (a == 0 && b == 6 )
                System.out.println("ноль умножить на шесть равно ноль");
            else if (a == 0 && b == 7)
                System.out.println("ноль умножить на семь равно ноль");
            else if (a == 0 && b == 8)
                System.out.println("ноль умножить на  восемь ноль");
            else if (a == 0 && b == 9)
                System.out.println("ноль умножить на девять равно ноль");
            else if (a == 0 && b == 10)
                System.out.println("ноль умножить на десять равно ноль");//ноль//
            else if (a == 1 && b == 0)
                System.out.println("один умножить на ноль равно ноль");
            else if (a == 1 && b == 1)
                System.out.println("один умножить на один равно один");
            else if (a == 1 && b == 2)
                System.out.println("один умножить на два равно два");
            else if (a == 1 && b == 3)
                System.out.println("один умножить на три равно три");
            else if (a == 1 && b == 4)
                System.out.println("один умножить на четыре равно четыре");
            else if (a == 1 && b == 5)
                System.out.println("один умножить на пять равно пять");
            else if (a == 1 && b == 6)
                System.out.println("один умножить на шесть равно шесть");
            else if (a == 1 && b == 7)
                System.out.println("один умножить на семь равно семь");
            else if (a == 1 && b == 8)
                System.out.println("один умножить на восемь равно восемь");
            else if (a == 1 && b == 9)
                System.out.println("один умножить на девять равно девять");
            else if (a == 1 && b == 10)
                System.out.println("один умножить на десять равно десять");//один//
            else if (a == 2 && b == 0)
                System.out.println("два умножить на ноль равно ноль");
            else if (a == 2 && b == 1)
                System.out.println("два умножить на один равно два");
            else if (a == 2 && b == 2)
                System.out.println("два умножить на два равно четыре");
            else if (a == 2 && b == 3)
                System.out.println("два умножить на три равно шесть");
            else if (a == 2 && b == 4)
                System.out.println("два умножить на четыре равно восемь");
            else if (a == 2 && b == 5)
                System.out.println("два умножить на пять равно десять");
            else if (a == 2 && b == 6)
                System.out.println("два умножить на шесть равно двенадцать");
            else if (a == 2 && b == 7)
                System.out.println("два умножить на семь равно четырнадцать");
            else if (a == 2 && b == 8)
                System.out.println("два умножить на восемь равно шестнадцать");
            else if (a == 2 && b == 9)
                System.out.println("два умножить на девять равно восемнадцать");
            else if (a == 2 && b == 10)
                System.out.println("два умножить на десять равно двадцать");//два//
            else if (a == 3 && b == 0)
                System.out.println("три умножить на ноль равно ноль");
            else if (a == 3 && b == 1)
                System.out.println("три умножить на один равно три");
            else if (a == 3 && b == 2)
                System.out.println("три умножить на два равно шесть");
            else if (a == 3 && b == 3)
                System.out.println("три умножить на три равно девять");
            else if (a == 3 && b == 4)
                System.out.println("три умножить на четыре равно двенадцать");
            else if (a == 3 && b == 5)
                System.out.println("три умножить на пять равно пятнадцать");
            else if (a == 3 && b == 6)
                System.out.println("три умножить на шесть равно восемнадцать");
            else if (a == 3 && b == 7)
                System.out.println("три умножить на семь равно двадцать один");
            else if (a == 3 && b == 8)
                System.out.println("три  умножить на восемь равно двадцать четыре");
            else if (a == 3 && b == 9)
                System.out.println("три умножить на девять равно двадцать семь");
            else if (a == 3 && b == 10)
                System.out.println("три умножить на десять равно тридцать");//три//
            else if (a == 4 && b == 0)
                System.out.println("четыре умножить на ноль равно ноль");
            else if (a == 4 && b == 1)
                System.out.println("четыре умножить на один равно четыре");
            else if (a == 4 && b == 2)
                System.out.println("четыре умножить на два равно восемь");
            else if (a == 4 && b == 3)
                System.out.println("четыре умножить на три равно двенадцать");
            else if (a == 4 && b == 4)
                System.out.println("четыре умножить на четыре равно шестнадцать");
            else if (a == 4 && b == 5)
                System.out.println("четыре умножить на пять равно двадцать");
            else if (a == 4 && b == 6)
                System.out.println("четыре умножить на шесть равно двадцать четыре");
            else if (a == 4 && b == 7)
                System.out.println("четыре  умножить на семь равно двадцать восемь");
            else if (a == 4 && b == 8)
                System.out.println("четыре  умножить на восемь равно тридцать два");
            else if (a == 4 && b == 9)
                System.out.println("четыре умножить на девять равно тридцать шесть");
            else if (a == 4 && b == 10)
                System.out.println("четыре умножить на десять равно сорок");//четыре//
            else if (a == 5 && b == 0)
                System.out.println("пять умножить на ноль равно ноль");
            else if (a == 5&& b == 1)
                System.out.println("пять умножить на один равно пять");
            else if (a == 5 && b == 2)
                System.out.println("пять умножить на два равно десять");
            else if (a == 5 && b == 3)
                System.out.println("пять умножить на три равно пятнадцать");
            else if (a == 5 && b == 4)
                System.out.println("пять умножить на четыре равно двадцать");
            else if (a == 5 && b == 5)
                System.out.println("пять умножить на пять равно двадцать пять");
            else if (a == 5 && b == 6)
                System.out.println("пять умножить на шесть равно тридцать");
            else if (a == 5 && b == 7)
                System.out.println("пять  умножить на семь равно тридцать пять");
            else if (a == 5 && b == 8)
                System.out.println("пять  умножить на восемь равно сорок");
            else if (a == 5 && b == 9)
                System.out.println("пять умножить на девять равно сорок пять");
            else if (a == 5 && b == 10)
                System.out.println("пять умножить на десять равно пятьдесят");//пять//
            else if (a == 6 && b == 0)
                System.out.println("шесть умножить на ноль равно ноль");
            else if (a == 6&& b == 1)
                System.out.println("шесть умножить на один равно шесть");
            else if (a == 6 && b == 2)
                System.out.println("шесть умножить на два равно двенадцать");
            else if (a == 6 && b == 3)
                System.out.println("шесть умножить на три равно восемнадцать");
            else if (a == 6 && b == 4)
                System.out.println("шесть умножить на четыре равно двадцать");
            else if (a == 6 && b == 5)
                System.out.println("шесть умножить на пять равно двадцать пять");
            else if (a == 6 && b == 6)
                System.out.println("шесть умножить на шесть равно тридцать шесть");
            else if (a == 6 && b == 7)
                System.out.println("шесть  умножить на семь равно сорок два");
            else if (a == 6 && b == 8)
                System.out.println("шесть  умножить на восемь равно сорок восемь");
            else if (a == 6 && b == 9)
                System.out.println("шесть умножить на девять равно пятьдесят четыре");
            else if (a == 6 && b == 10)
                System.out.println("шесть умножить на десять равно шестьдесят");//шесть//
            else if (a == 7 && b == 0)
                System.out.println("семь умножить на ноль равно ноль");
            else if (a == 7&& b == 1)
                System.out.println("семь умножить на один равно семь");
            else if (a == 7 && b == 2)
                System.out.println("семь умножить на два равно четырнадцать");
            else if (a == 7 && b == 3)
                System.out.println("семь умножить на три равно двадцать один");
            else if (a == 7 && b == 4)
                System.out.println("семь умножить на четыре равно двадцать восемь");
            else if (a == 7 && b == 5)
                System.out.println("пять умножить на пять равно тридцать пять");
            else if (a == 7 && b == 6)
                System.out.println("семь умножить на шесть равно сорок два");
            else if (a == 7 && b == 7)
                System.out.println("семь  умножить на семь равно сорок девять");
            else if (a == 7 && b == 8)
                System.out.println("семь  умножить на восемь равно пятьдесят шесть");
            else if (a == 7 && b == 9)
                System.out.println("семь умножить на девять равно шестьдесят три");
            else if (a == 7 && b == 10)
                System.out.println("семь умножить на десять равно семьдесят");//семь//
            else if (a == 8 && b == 0)
                System.out.println("восемь умножить на ноль равно ноль");
            else if (a == 8&& b == 1)
                System.out.println("восемь умножить на один равно восемь");
            else if (a == 8 && b == 2)
                System.out.println("восемь умножить на два равно шестнадцать");
            else if (a == 8 && b == 3)
                System.out.println("восемь умножить на три равно двадцать четыре");
            else if (a == 8 && b == 4)
                System.out.println("восемь умножить на четыре равно тридцать два");
            else if (a == 8 && b == 5)
                System.out.println("восемь умножить на пять равно сорок");
            else if (a == 8 && b == 6)
                System.out.println("восемь умножить на шесть равно сорок восемь");
            else if (a == 8 && b == 7)
                System.out.println("восемь  умножить на семь равно пятьдесят 6");
            else if (a == 8 && b == 8)
                System.out.println("восемь  умножить на восемь равно шестьдесят четыре");
            else if (a == 8 && b == 9)
                System.out.println("восемь умножить на девять равно семьдесят два");
            else if (a == 8 && b == 10)
                System.out.println("девять умножить на десять равно восемьдесят");//восемь//
            else if (a == 9 && b == 0)
                System.out.println("девять умножить на ноль равно ноль");
            else if (a == 9&& b == 1)
                System.out.println("девять умножить на один равно девять");
            else if (a == 9 && b == 2)
                System.out.println("девять умножить на два равно восемнадцать");
            else if (a == 9 && b == 3)
                System.out.println("девять умножить на три равно двадцать семь");
            else if (a == 9 && b == 4)
                System.out.println("девять умножить на четыре равно тридцать шесть");
            else if (a == 9 && b == 5)
                System.out.println("девять умножить на пять равно сорок пять");
            else if (a == 9 && b == 6)
                System.out.println("девять умножить на шесть равно пятьдесят четыре");
            else if (a == 9 && b == 7)
                System.out.println("девять  умножить на семь равно шестьдесят три");
            else if (a == 9 && b == 8)
                System.out.println("девять  умножить на восемь равно семьдесят два");
            else if (a == 9 && b == 9)
                System.out.println("девять умножить на девять равно восемьдесят один");
            else if (a == 9 && b == 10)
            System.out.println("девять умножить на десять равно девяносто");//девять//
            else if (a == 10 && b == 0)
                System.out.println("десять умножить на ноль равно ноль");
            else if (a == 10&& b == 1)
                System.out.println("десять умножить на один равно десять");
            else if (a == 10 && b == 2)
                System.out.println("десять умножить на два равно двадцать");
            else if (a == 10 && b == 3)
                System.out.println("десять умножить на три равно тридцать");
            else if (a == 10 && b == 4)
                System.out.println("десять умножить на четыре равно сорок");
            else if (a == 10 && b == 5)
                System.out.println("десять умножить на пять равно пятьдесят");
            else if (a == 10 && b == 6)
                System.out.println("десять умножить на шесть равно шестьдесят");
            else if (a == 10 && b == 7)
                System.out.println("десять  умножить на семь равно семьдесят");
            else if (a == 10 && b == 8)
                System.out.println("десять  умножить на восемь равно восемьдесят");
            else if (a == 10 && b == 9)
                System.out.println("десять умножить на девять равно девяносто");
            else
                System.out.println("десять умножить на десять равно сто");//десять//

        } else
            System.out.println("нужно вводить толко цифры, т.е. значения от 0 до 10");


    }
}
