package by.itland.itjava.davydovskikh.less3;

import java.util.Scanner;

public class IharBot {
    public static void main(String[] args) {
        System.out.println("Какую в хотите зарплату в $$$?");
        Scanner scanner = new Scanner(System.in);
        double zarplata = scanner.nextDouble();
        if (zarplata < 300 || zarplata > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            System.out.println("Какой месяц вас интересует?");
            int mounth = scanner.nextInt();
            if (mounth == 6)
                System.out.printf("За месяц июнь начислено $%.2f", zarplata);
            else if (mounth == 7)
                System.out.printf("За месяц июль начислено $%.2f", zarplata);
            else if (mounth == 8)
                System.out.printf("За месяц август начислено $%.2f", zarplata);
            else if (mounth <= 0 || mounth > 12)
                System.out.printf("За месяц %d начислено $0,00", mounth);
            else {
                double res = zarplata + (zarplata * 0.5);
                if (mounth == 1)
                    System.out.printf(" За месяц январь начислено $%.2f", res);
                else if (mounth == 2)
                    System.out.printf(" За месяц февраль начислено $%.2f", res);
                else if (mounth == 3)
                    System.out.printf(" За месяц март начислено $%.2f", res);
                else if (mounth == 4)
                    System.out.printf(" За месяц апрель начислено $%.2f", res);
                else if (mounth == 5)
                    System.out.printf(" За месяц май начислено $%.2f", res);
                else if (mounth == 9)
                    System.out.printf(" За месяц сентябрь начислено $%.2f", res);
                else if (mounth == 10)
                    System.out.printf(" За месяц октябрь начислено $%.2f", res);
                else if (mounth == 11)
                    System.out.printf(" За месяц ноябрь начислено $%.2f", res);
                else
                    System.out.printf(" За месяц декабрь начислено $%.2f", res);
            }
        }
    }
}


