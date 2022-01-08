package by.itland.itjava.timshina.lesson08;

import java.util.Scanner;

public class AtmMachine {

}<<<<<<< HEAD
=======
    /*private static int cup3 = 100;
    private static int cup2 = 50;
    private static int cup1 = 20;*/

>>>>>>> 5a82101 (08.01)
    public static void main(String[] args) {
        int cup1 = 20;
        int cup2 = 50;
        int cup3 = 100;
        int money = 0;
        int take = 0;
<<<<<<< HEAD
        boolean operation = true;
=======
        Boolean operation;
>>>>>>> 5a82101 (08.01)
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        System.out.println("Хотите начать?");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
<<<<<<< HEAD
        while (operation) {
=======
        while (operation=true) {
>>>>>>> 5a82101 (08.01)
            if (start.equals("да")) {
                System.out.println("Выберите необходимую операцию: \n1. Снять наличные \n2. Положить наличные на счёт \n3. Посмотреть баланс");
                int op = scanner.nextInt();
                if (op == 1) {
                    System.out.println("Сколько хотите снять?");
                    take = scanner.nextInt();
<<<<<<< HEAD
                        while (take >= cup3) {
=======
                    while (take > 19){
                        while (take >= cup3){
>>>>>>> 5a82101 (08.01)
                            take = take - cup3;
                            money = money - cup3;
                            count3++;
                        }
<<<<<<< HEAD
                        while (take >= cup2) {
=======
                        while (take >= cup2){
>>>>>>> 5a82101 (08.01)
                            take = take - cup2;
                            money = money - cup2;
                            count2++;
                        }
<<<<<<< HEAD
                        while (take >= cup1) {
=======
                        while (take >= cup1){
>>>>>>> 5a82101 (08.01)
                            take = take - cup1;
                            money = money - cup1;
                            count1++;
                        }
<<<<<<< HEAD
                    System.out.printf("Снято: \n%d купюр(а/ы) по 20\n%d купюр(а/ы) по 50\n%d купюр(а/ы) по 100\n", count1, count2, count3);
                    System.out.println("Хотите продолжить?");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("да");
                } else if (op == 2) {
                    System.out.println("Сколько хотите положить?");
                    money = money + scanner.nextInt();
                    System.out.println("На вашем счету: " + " " + money + " " + " деняк");
                    System.out.println("Хотите продолжить?");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("да");
                } else if (op == 3) {
                    System.out.println("На вашем счету: " + " " + money);
                    System.out.println("Хотите продолжить?");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("да");
                } else {
                    System.out.println("Неизвестная операция");
                    System.out.println("Хотите продолжить?");
                    String a = scanner.next();
                    operation = a.equalsIgnoreCase("да");
                }
=======
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

>>>>>>> 5a82101 (08.01)
            } else {
                System.out.println("Хорошо, до свидания!");
            }
        }
    }
<<<<<<< HEAD
}
=======
    /*private static Boolean check(Boolean x, Boolean y){
        System.out.println("Хотите продолжить?");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equals("да")){
            return x;
        }
        else return y;
    }*/
}
>>>>>>> 5a82101 (08.01)
