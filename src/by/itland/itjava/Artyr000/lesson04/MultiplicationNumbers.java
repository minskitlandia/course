package by.itland.itjava.Artyr000.lesson04;

import java.util.Scanner;

public class MultiplicationNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a*b;
        String s1 = convertNumberToString(a);
        String s2 = convertNumberToString(b);
        String s3 = convertNumberToString(c);
        System.out.printf("%s умножить на %s равно %s", s1, s2, s3);
        }

    private static String convertNumberToString(int number){
        switch (number){
            case 0:
                return "ноль";
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шеснадцать";
            case 17:
                return "семнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
            case 20:
                return "двадцать";
            case 21:
                return "двадцать один";
            case 22:
                return "двадцать два";
            case 23:
                return "двадцать три";
            case 24:
                return "двадцать четыре";
            case 25:
                return "двадцать пять";
            case 26:
                return "двадцать шесть";
            case 27:
                return "двадцать семь";
            case 28:
                return "двадцать восемь";
            case 29:
                return "двадцать девять";
            case 30:
                return "тридцать";
            case 31:
                return "тридцать один";
            case 32:
                return "тридцать два";
            case 33:
                return "тридцать три";
            case 34:
                return "тридцать четыре";
            case 35:
                return "тридцать пять";
            case 36:
                return "тридцать шесть";
            case 37:
                return "тридцать семь";
            case 38:
                return "тридцать восемь";
            case 39:
                return "тридцать девять";
            case 40:
                return "сорок";
            case 41:
                return "сорок один";
            case 42:
                return "сорок два";
            case 43:
                return "сорок три";
            case 44:
                return "сорок четыре";
            case 45:
                return "сорок пять";
            case 46:
                return "сорок шесть";
            case 47:
                return "сорок семь";
            case 48:
                return "сорок восемь";
            case 49:
                return "сорок девять";
            case 50:
                return "пятьдесят";
            case 51:
                return "пятьдесят один";
            case 52:
                return "пятьдесят два";
            case 53:
                return "пятьдесят три";
            case 54:
                return "пятьдесят четыре";
            case 55:
                return "пятьдесят пять";
            case 56:
                return "пятьдесят шесть";
            case 57:
                return "пятьдесят семь";
            case 58:
                return "пятьдесят восемь";
            case 59:
                return "пятьдесят девять";
            case 60:
                return "шестьдесят";
            case 61:
                return "шестьдесят один";
            case 62:
                return "шестьдесят два";
            case 63:
                return "шестьдесят три";
            case 64:
                return "шестьдесят четыре";
            case 65:
                return "шестьдесят пять";
            case 66:
                return "шестьдесят шесть";
            case 67:
                return "шестьдесят семь";
            case 68:
                return "шестьдесят восемь";
            case 69:
                return "шестьдесят девять";
            case 70:
                return "семьдесят";
            case 71:
                return "семьдесят один";
            case 72:
                return "семьдесят два";
            case 73:
                return "семьдесят три";
            case 74:
                return "семьдесят четыре";
            case 75:
                return "семьдесят пять";
            case 76:
                return "семьдесят шесть";
            case 77:
                return "семьдесят семь";
            case 78:
                return "семьдесят восемь";
            case 79:
                return "семьдесят девять";
            case 80:
                return "восемьдесят";
            case 81:
                return "восемьдесят один";
            case 82:
                return "восемьдесят два";
            case 83:
                return "восемьдесят три";
            case 84:
                return "восемьдесят четыре";
            case 85:
                return "восемьдесят пять";
            case 86:
                return "восемьдесят шесть";
            case 87:
                return "восемьдесят семь";
            case 88:
                return "восемьдесят восемь";
            case 89:
                return "восемьдесят девять";
            case 90:
                return "девяносто";
            case 91:
                return "девяносто один";
            case 92:
                return "девяносто два";
            case 93:
                return "девяносто три";
            case 94:
                return "девяносто четыре";
            case 95:
                return "девяносто пять";
            case 96:
                return "девяносто шесть";
            case 97:
                return "девяносто семь";
            case 98:
                return "девяносто восемь";
            case 99:
                return "девяносто девять";
            case 100:
                return "сто";
            case -1:
                return "минус один";
            case -2:
                return "минус два";
            case -3:
                return "минус три";
            case -4:
                return "минус четыре";
            case -5:
                return "минус пять";
            case -6:
                return "минус шесть";
            case -7:
                return "минус семь";
            case -8:
                return "минус восемь";
            case -9:
                return "минус девять";
            case -10:
                return "минус десять";
            case -11:
                return "минус одиннадцать";
            case -12:
                return "минус двенадцать";
            case -13:
                return "минус тринадцать";
            case -14:
                return "минус четырнадцать";
            case -15:
                return "минус пятнадцать";
            case -16:
                return "минус шеснадцать";
            case -17:
                return "минус семнадцать";
            case -18:
                return "минус восемнадцать";
            case -19:
                return "минус девятнадцать";
            case -20:
                return "минус двадцать";
            case -21:
                return "минус двадцать один";
            case -22:
                return "минус двадцать два";
            case -23:
                return "минус двадцать три";
            case -24:
                return "минус двадцать четыре";
            case -25:
                return "минус двадцать пять";
            case -26:
                return "минус двадцать шесть";
            case -27:
                return "минус двадцать семь";
            case -28:
                return "минус двадцать восемь";
            case -29:
                return "минус двадцать девять";
            case -30:
                return "минус тридцать";
            case -31:
                return "минус тридцать один";
            case -32:
                return "минус тридцать два";
            case -33:
                return "минус тридцать три";
            case -34:
                return "минус тридцать четыре";
            case -35:
                return "минус тридцать пять";
            case -36:
                return "минус тридцать шесть";
            case -37:
                return "минус тридцать семь";
            case -38:
                return "минус тридцать восемь";
            case -39:
                return "минус тридцать девять";
            case -40:
                return "минус сорок";
            case -41:
                return "минус сорок один";
            case -42:
                return "минус сорок два";
            case -43:
                return "минус сорок три";
            case -44:
                return "минус сорок четыре";
            case -45:
                return "минус сорок пять";
            case -46:
                return "минус сорок шесть";
            case -47:
                return "минус сорок семь";
            case -48:
                return "минус сорок восемь";
            case -49:
                return "минус сорок девять";
            case -50:
                return "минус пятьдесят";
            case -51:
                return "минус пятьдесят один";
            case -52:
                return "минус пятьдесят два";
            case -53:
                return "минус пятьдесят три";
            case -54:
                return "минус пятьдесят четыре";
            case -55:
                return "минус пятьдесят пять";
            case -56:
                return "минус пятьдесят шесть";
            case -57:
                return "минус пятьдесят семь";
            case -58:
                return "минус пятьдесят восемь";
            case -59:
                return "минус пятьдесят девять";
            case -60:
                return "минус шестьдесят";
            case -61:
                return "минус шестьдесят один";
            case -62:
                return "минус шестьдесят два";
            case -63:
                return "минус шестьдесят три";
            case -64:
                return "минус шестьдесят четыре";
            case -65:
                return "минус шестьдесят пять";
            case -66:
                return "минус шестьдесят шесть";
            case -67:
                return "минус шестьдесят семь";
            case -68:
                return "минус шестьдесят восемь";
            case -69:
                return "минус шестьдесят девять";
            case -70:
                return "минус семьдесят";
            case -71:
                return "минус семьдесят один";
            case -72:
                return "минус семьдесят два";
            case -73:
                return "минус семьдесят три";
            case -74:
                return "минус семьдесят четыре";
            case -75:
                return "минус семьдесят пять";
            case -76:
                return "минус семьдесят шесть";
            case -77:
                return "минус семьдесят семь";
            case -78:
                return "минус семьдесят восемь";
            case -79:
                return "минус семьдесят девять";
            case -80:
                return "минус восемьдесят";
            case -81:
                return "минус восемьдесят один";
            case -82:
                return "минус восемьдесят два";
            case -83:
                return "минус восемьдесят три";
            case -84:
                return "минус восемьдесят четыре";
            case -85:
                return "минус восемьдесят пять";
            case -86:
                return "минус восемьдесят шесть";
            case -87:
                return "минус восемьдесят семь";
            case -88:
                return "минус восемьдесят восемь";
            case -89:
                return "минус восемьдесят девять";
            case -90:
                return "минус девяносто";
            case -91:
                return "минус девяносто один";
            case -92:
                return "минус девяносто два";
            case -93:
                return "минус девяносто три";
            case -94:
                return "минус девяносто четыре";
            case -95:
                return "минус девяносто пять";
            case -96:
                return "минус девяносто семь";
            case -98:
                return "минус девяносто восемь";
            case -99:
                return "минус девяносто девять";
            case -100:
                return "минус сто";
            default:
                return "такого не существует";
        }
    }
}