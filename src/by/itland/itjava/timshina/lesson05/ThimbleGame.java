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
        System.out.println("Choose the language/Выберите язык:\n   english(eng)\n   russian(rus)\n   английский(анг)\n   русский(рус)");
        String lan = scanner.nextLine();
        if(lan.equals("russian")||lan.equals("rus")||lan.equals("русский")||lan.equals("рус")) {
            System.out.printf("Привет, у тебя есть %d монет, хочешь сыграть?\n->", money);
            String start = scanner.nextLine();

            if (start.equals("да") || start.equals("нуы")) {
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
                                System.out.println("Введите в диапазоне от 1 до 3");
                            }
                        }
                        else {
                            System.out.println("Ставка слишком большая!");
                        }
                    }
                }
            } else {
                System.out.println("До скорой встречи!");
            }
            if (col == 0) {
                System.out.println("У Вас не хватает попыток");
            } else if (money < 1) {
                System.out.println("У Вас не хватает денег");

            }
        }
        else if (lan.equals("english")||lan.equals("eng")||lan.equals("английский")||lan.equals("анг")){
            System.out.printf("Hi, you have %d coins, do you want to play?\n->", money);
            String start = scanner.nextLine();

            if (start.equals("yes") || start.equals("lf")) {
                System.out.println("Great, let's get started!");
                for (int i = money; i < 2000; i += 100) {
                    while (col > 0) {
                        System.out.println("Enter your bet");
                        bet = scanner.nextInt();
                        if (bet <= money) {
                            num = RandomNumber();
                            System.out.println("Enter a number in the range from 1 to 3");
                            int ans = scanner.nextInt();
                            if (ans > 0 && ans < 4) {
                                if (ans == num) {
                                    System.out.printf("You guessed it, +%d coins!\n", bet);
                                    money += bet;
                                    col -= 1;
                                    System.out.printf("Coins: %d\nAttempts: %d\n", money, col);
                                } else {
                                    System.out.printf("No, you guessed wrong, -%d coins\n", bet);
                                    money -= bet;
                                    col -= 1;
                                    System.out.printf("Coins: %d\nAttempts: %d\n", money, col);
                                }
                            } else {
                                System.out.println("Enter in the range from 1 to 3");
                            }
                        } else {
                            System.out.println("The bet is too big!");
                        }
                    }
                }
            } else {
                System.out.println("See you soon");
            }
            if (col == 0) {
                System.out.println("You don't have enough attempts");
            } else if (money < 1) {
                System.out.println("You don't have enough money");

            }
        }
        else{
            System.out.println("You spelled it wrong/Вы написали неправильно");
        }
    }
}