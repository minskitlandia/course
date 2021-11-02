package by.itland.itjava.drobyazko.lesson03;

import java.util.Scanner;

public class IharBot {
    public static void main(String[] args) {
        System.out.println("Какую в хотите зарплату в $$$?");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(); //зарплата//
        if (x < 300 || x > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            System.out.println("Какой месяц вас интересует?");
            int m = scanner.nextInt(); //месяц//
            if (m == 6)
                System.out.printf("За месяц июнь начислено $%.2f", x);
            else if (m == 7)
                System.out.printf("За месяц июль начислено $%.2f", x);
            else if (m == 8)
                System.out.printf("За месяц август начислено $%.2f", x);
            else if (m <= 0 || m > 12)
                System.out.printf("За месяц %d начислено $0,00", m );
            else {
                double res = x + (x * 0.5);
                if (m==1)
                System.out.printf(" За месяц январь начислено $%.2f",res);
                else if (m==2)
                    System.out.printf(" За месяц февраль начислено $%.2f",res);
                else if (m==3)
                    System.out.printf(" За месяц март начислено $%.2f",res);
                else if (m==4)
                    System.out.printf(" За месяц апрель начислено $%.2f",res);
                else if (m==5)
                    System.out.printf(" За месяц май начислено $%.2f",res);
                else if (m==9)
                    System.out.printf(" За месяц сентябрь начислено $%.2f",res);
                else if (m==10)
                    System.out.printf(" За месяц октябрь начислено $%.2f",res);
                else if (m==11)
                    System.out.printf(" За месяц ноябрь начислено $%.2f",res);
                else
                    System.out.printf(" За месяц декабрь начислено $%.2f",res);
            }
        }


    }
}
