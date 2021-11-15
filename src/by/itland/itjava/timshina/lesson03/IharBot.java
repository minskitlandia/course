package by.itland.itjava.timshina.lesson03;

import java.util.Scanner;

public class IharBot {
    private static String Month(int month) {
        switch (month) {
            case 1:
                return "январь";
            case 2:
                return "февраль";
            case 3:
                return "март";
            case 4:
                return "апрель";
            case 5:
                return "май";
            case 6:
                return "июнь";
            case 7:
                return "июль";
            case 8:
                return "август";
            case 9:
                return "сентябрь";
            case 10:
                return "октябрь";
            case 11:
                return "ноябрь";
            case 12:
                return "декабрь";
            default: return "";
        }
    }


    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner scanner = new Scanner(System.in);
        Double m = scanner.nextDouble();
        if (m < 300 || m > 3000) {
            System.out.println("Мы вам перезвоним!");
        }
        else {
            System.out.println("Какой месяц вас интересует?");
            int x = scanner.nextInt();
            if (x<1 || x>12){
                System.out.printf("За месяц %d начислено $0,00", x);
            }
            else if (x==6||x==7||x==8) {

                System.out.printf("За месяц %s начислено $%.2f", Month(x), m);
            }
            else {
                System.out.printf("За месяц %s начислено $%.2f", Month(x), (m+m*0.5));
            }
        }

    }
}

