package by.itland.itjava.Artyr000.lesson08;

import java.util.Scanner;

public class AtmMachine {

    int twenty;
    int fifty;
    int hundred;
    int balance;

    public AtmMachine(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
        recalculationBalance();
    }

    private void recalculationBalance() {
        balance = this.twenty * 20 + this.fifty * 50 + this.hundred * 100;
    }

    int getBalance() {
        recalculationBalance();
        return balance;
    }

    boolean getMoney(int money) {
        if (money > balance) {
            return false;
        } else {
            return true;
        }
    }

    void infoCash(int money) {
        int countHundred = 0;
        int countFifty = 0;
        int countTwenty = 0;
        balance -= money;
        while (money >= 100 && hundred > 0) {
            hundred--;
            money -= 100;
            countHundred++;
        }
        while (money >= 50 && fifty > 0) {
            fifty--;
            money -= 50;
            countFifty++;
        }
        while (money >= 20 && twenty > 0) {
            twenty--;
            money -= 20;
            countTwenty++;
        }
        if (money != 0) {
            System.out.println("Банкомат не может вам выдать столько денег");
            this.hundred += countHundred;
            this.fifty += countFifty;
            this.twenty += countTwenty;
            recalculationBalance();
        } else {
            System.out.printf("100: %d 50: %d 20: %d \n", countHundred, countFifty, countTwenty);
        }
    }

    void addMoney(int hundred, int fifty, int twenty) {
        this.hundred += hundred;
        this.fifty += fifty;
        this.twenty += twenty;
        recalculationBalance();
    }

    void infoAtm() {
        System.out.println("В банкомате " + getBalance() + " денег");
        System.out.printf("100: %d 50: %d 20: %d \n", this.hundred, this.fifty, this.twenty);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        by.itland.itjava.naumenko.lesson08.AtmMachine atm = new by.itland.itjava.naumenko.lesson08.AtmMachine(5, 5, 5);
        atm.infoAtm();
        atm.addMoney(1, 1, 1);
        atm.infoAtm();
        System.out.println("Сколько хотите снять?");
        int money = scanner.nextInt();
        if (!atm.getMoney(money)) {
            System.out.println("В банкомате недостаточно денег(");
        } else {
            atm.infoCash(money);
        }
        atm.infoAtm();
    }
}