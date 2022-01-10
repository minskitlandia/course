package by.itland.itjava.davydovskikh.less8;

import java.util.Scanner;

public class bankomat {
    public int count20;
    public int count50;
    public int count100;

    public bankomat(int twenty, int fifty, int hundred){
        this.count20 = twenty;
        this.count50 = fifty;
        this.count100 = hundred;
    }
    public int addBYN20(int number) {
        return count20 += number;
    }

    public int addBYN50(int number) {
        return count50 += number;
    }

    public int addBYN100(int number) {
        return count100 += number;
    }

    public static void main(String[] args) {
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int twenty = 20;
        int fifty = 50;
        int hundred = 100;
        int check = 0; //счёт, либо баланс с самого начала
        int snyat = 0; // для снятия, а вообще это тимшина придумала такое мне название ахаххахаха
        boolean oper = true;
        System.out.println("Вставьте вашу карту");
        System.out.println(" ");
        while (oper) {
            System.out.println("Выберите действие: 1 - положить деньги на карту, 2 - снять деньги, 3 - посмотреть баланс,0 - выход");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 1) {
                // System.out.println("Подождите немного, банкомат загружается чтобы скушать ваши деньги))");
                //check = check + scanner.nextInt();
                System.out.println("Подождите немного, банкомат загружается чтобы скушать ваши деньги))");
                System.out.println("Какую сумму вы хотите положить?");
                check = check + scanner.nextInt();
                System.out.println("На вашу карту зачисленно: " + check + " BYN");
                System.out.println("Eсли хотите продолжить нажмите 0");
                String a = scanner.next();
                oper = a.equalsIgnoreCase("0");
            }
            if (answer == 2) {
                System.out.println("Какую сумму вы желаете получить?");
                snyat = scanner.nextInt();
                while (check > 19) {
                    while (snyat >= count100) {
                        snyat = snyat - hundred;
                        check = check - hundred;
                        count100++;
                    }
                    while (snyat >= count20) {
                        snyat = snyat - twenty;
                        check = check - twenty;
                        count20++;
                    }
                    while (snyat >= count50) {
                        snyat = snyat - fifty;
                        check = check - fifty;
                        count50++;
                    }
                }
                System.out.printf("Снято: \n%d купюр(а/ы) по 20\n%d купюр(а/ы) по 50\n%d купюр(а/ы) по 100\n",
                        count20, count50, count100);
                String a = scanner.next();
                oper = a.equalsIgnoreCase("0");
            }
            if (answer == 3) {
                System.out.println("На вашем балансе: " + check  + " BYN");
                System.out.println("Eсли хотите продолжить нажмите 0");
                String a = scanner.next();
                oper = a.equalsIgnoreCase("0");
            } else if (answer == 0) {
                break;
            }
        }
    }
}