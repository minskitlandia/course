package by.itland.itjava.timshina.lesson05;

import java.util.Scanner;


public class ThimbleGame {
    public static int RandomNumber() {
        return (int) (Math.random() * 3 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 1000;
        int num = 0;
        int col = 10;
        int bet = 0;
        System.out.printf("Привет, у тебя есть %d монет, хочешь сыграть?\n", money);
        String start = scanner.nextLine();

        if (start.equals("да")) {
            System.out.println("Отлично, начнём!");
            for (int i = money; i < 2000; i += 100) {
                while (col > 0) {
                    System.out.println("Введите Вашу ставку");
                    bet = scanner.nextInt();
                    if (bet <= money) {
                        num = RandomNumber();
                        System.out.println("Введите число в диапазоне от 1 до 3");
                        int ans = scanner.nextInt();
                        if (ans > 0 && ans < 4) {
                            if (ans == num) {
                                System.out.printf("Вы угадали, +%d монет!\n", bet);
                                money += bet;
                                col -= 1;
                                System.out.printf("Монеты: %d\nПопытки: %d\n", money, col);
                            } else {
                                System.out.printf("Нет, Вы не угадали, -%d монет\n", bet);
                                money -= bet;
                                col -= 1;
                                System.out.printf("Монеты: %d\nПопытки: %d\n", money, col);
                            }
                        } else {
                            System.out.println("Введите в диапозоне от 1 до 3");
                        }
                    } else {
                        System.out.println("Ставка слишком большая!");
                    }
                }
            }
        } else {
            System.out.println("Отлично, до скорой встречи!");
        }
        if (col == 0) {
            System.out.println("У Вас не хватает попыток");
        } else if (money < 1) {
            System.out.println("У Вас не хватает денег");

        }
    }
}