package by.itland.itjava.davydovskikh.less5;

import java.util.Scanner;

public class ThimbleGame {
    public static int RandomNumber() {
        return (int) (Math.random() * 3 + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 100; //деньги
        int attempts = 3; //попытки
        int bet = 0; //ставка
        int number = 0; //число
        System.out.printf("Добро пожаловать в казино, у вас есть %d$. \nСыграем?  да\\нет\n", money);
        String start = scanner.nextLine();

        if (start.equalsIgnoreCase("да")) {
            while (attempts > 0) {
                if (money <= 0) {
                    System.out.println("Игра закончена. Твои деньги закончались");
                    break;
                } else {
                    System.out.println("сделайте вашу ставку:");
                    bet = scanner.nextInt();
                    if (bet <= money) {
                        number = RandomNumber();
                        System.out.println("Введите любое число от 1 до 3");
                        int answer = scanner.nextInt();
                        if (answer > 0 && answer < 4) {
                            if (answer == number) {
                                System.out.printf("о,везунчик) + %d$ в твою казну.\n", bet);
                                money += bet;
                                attempts -= 1;
                                System.out.printf("У тебя осталось:\n%d$ ; попытки: %d\n", money, attempts);
                            } else {
                                System.out.printf("мимо...");
                                money -= bet;
                                attempts -= 1;
                                System.out.printf("У тебя осталось:\n%d$ ; попытки: %d\n", money, attempts);
                            }
                        } else {
                            System.out.println("Ошибка!!!Введите любое число от 1 до 3");
                        }
                    } else {
                        System.out.println("Ставка слишком большая.");
                    }

                }
            }

            if (attempts == 0) {
                System.out.println("Игра закончена. Твои попытки закончились");
            }
        } else {
            System.out.println("ну пока:\\\\");
        }

    }

}
