package by.itland.itjava.timshina.lesson08;

import java.util.Scanner;

public class AtmMachine {

    public static void main(String[] args) {
        int cup1 = 20;
        int cup2 = 50;
        int cup3 = 100;
        int money = 0;
        int take = 0;
        boolean operation = true;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        System.out.println("Хотите начать?");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        while (operation) {
            if (start.equals("да")) {
                System.out.println("Выберите необходимую операцию: \n1. Снять наличные \n2. Положить наличные на счёт \n3. Посмотреть баланс");
                int op = scanner.nextInt();
                if (op == 1) {
                    System.out.println("Сколько хотите снять?");
                    take = scanner.nextInt();

                    while (take > 19) {
                        while (take >= cup3) {

                            take = take - cup3;
                            money = money - cup3;
                            count3++;
                        }

                        while (take >= cup2) {

                            take = take - cup2;
                            money = money - cup2;
                            count2++;
                        }

                        while (take >= cup1) {
                            take = take - cup1;
                            money = money - cup1;
                            count1++;
                        }
                    }
                    System.out.printf("Снято: \n%d купюр по 20\n%d купюр по 50\n%d купюр по 100\n", count1, count2, count3);
                    operation = false;
                    System.out.println("Хотите продолжить?");
                    String a = scanner.nextLine();
                    operation = a.equals("да");
                } else if (op == 2) {
                    System.out.println("Сколько хотите положить?");
                    money = money + scanner.nextInt();
                    System.out.println("На вашем счету: " + " " + money);
                    operation = false;
                    System.out.println("Хотите продолжить?");
                    String a = scanner.nextLine();
                    operation = a.equals("да");
                } else if (op == 3) {
                    System.out.println("На вашем счету: " + " " + money);
                    operation = false;
                    System.out.println("Хотите продолжить?");
                    String a = scanner.nextLine();
                    operation = a.equals("да");
                } else {
                    System.out.println("Неизвестная операция");
                    operation = false;
                    System.out.println("Хотите продолжить?");
                    String a = scanner.nextLine();
                    operation = a.equals("да");
                }


            } else {
                System.out.println("Хорошо, до свидания!");
            }
        }
    }
}

