package by.itland.itjava.davydovskikh.less8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// белки (Belki) - белорусские рубли
// AtmMachine - ATM

public class AtmMachine {

    public static void main(String[] args) {
        ATM atm = new ATM(3);// в банкомат запускаем количество номиналов купюр
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: 1 - положить деньги на карту, 2 - снять деньги, 0 - выход");
            try {
                int code = Integer.parseInt(scanner.nextLine());
                if (code == 0) {//выход
                    break;
                } else if (code == 1) {
                    atm.setBelki();// деньги на карту
                } else // снимаем деньги
                    if (code == 2) atm.getBelki();
                    else {
                        System.err.println("Неизвестная операция");//если пользователь выбрал несуществующую операцию
                    }
            } catch (NumberFormatException e) {//пользователь вообще ввёл не цифры
                System.err.println("Ребёнок, научись пользовать банкоматом");
            }
        }
        scanner.close();
    }

    static class ATM {
        private final Belki[] b;
        private final int[] nam = new int[]{20, 50, 100};

        public ATM(int n) {
            b = new Belki[nam.length];
            Random r = new Random();//для автозаполнения банкомата белками
            for (int i = 0; i < n; i++) {
                b[i] = new Belki(nam[i], r.nextInt(100) + 1);//заполняем банкомат белками
            }
        }

        public void setBelki() { // кладём деньги в банкомат
            System.out.println("Подождите немного, банкомат загружается чтобы скушать ваши деньги))");
            Scanner scanner = new Scanner(System.in);
            int i;
            for (i = 0; i < nam.length; i++) {
                System.out.println("Введите количество купюр номиналом " + nam[i] + " BYN");
                int n = Integer.parseInt(scanner.nextLine());
                if (b[i] != null) {
                    b[i].addBelki(n);
                } else b[i] = new Belki(nam[i], n);

            }
            System.out.print("\nBы успешно положили деньги на свою карту\n\n");
        }

        private void getBelki() {
            System.out.print("В банкомате имеются купюры номиналом: ");
            printNam();
            System.out.println("\nВведите сумму");
            int sum;
            try (Scanner scanner = new Scanner(System.in)) {
                sum = Integer.parseInt(scanner.nextLine());
            }
            if (colichestvo(sum)) System.out.println("операция невозможна\n\n");
            else System.out.println("\n\n");
        }

        public void printNam() {
            for (Belki belki : b) {
                if (belki != null && belki.isMoney()) {
                    System.out.print(belki.getNominal() + ", ");
                }
            }
        }

        public boolean colichestvo(int sum) {
            var l = new ArrayList<Loc>();
            if (sum % 10 != 0) {
                return false;
            } else {
                int i = b.length - 1;
                while (i >= 0) {
                    if (b[i] != null) {
                        //проверяем хватит ли денег в банкомате
                        int request = sum % b[i].getNominal(); // запрос
                        if (b[i].BelkiVNorme(request)) {//деньги в норме,всё хватает
                            l.add(new Loc(i, request));
                            sum -= request * b[i].getNominal();
                        }
                        if (sum == 0) {
                            break;
                        }
                    }
                    i++;
                }
                if (sum != 0) return false;
                else {
                    //Выдаем деньги
                    System.out.println("Вы получили купюры:");
                    for (Loc loc : l) {
                        b[loc.position].getMoney(loc.n);
                    }
                    return true;
                }
            }
        }

    }

    public static class Belki {
        public int nominal;
        public int n;

        public Belki(int nom, int n) {
            nominal = nom;
            this.n = n;
        }

        public void addBelki(int n) {
            this.n += n;
        }

        public boolean isMoney() {
            return n > 0;
        }

        public int getNominal() {
            return nominal;
        }

        public boolean BelkiVNorme(int request) {
            return request <= n;
        }

        public void getMoney(int n) {
            this.n -= n;
            System.out.println(nominal + "BYN. = " + n);
        }
    }

    public static class Loc {
        int position;
        int n;

        public Loc(int p, int nn) {
            position = p;
            n = nn;
        }
    }
}