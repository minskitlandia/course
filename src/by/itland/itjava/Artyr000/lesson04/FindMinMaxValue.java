package by.itland.itjava.Artyr000.lesson04;

import java.util.Scanner;

public class FindMinMaxValue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c= scanner.nextInt();
            int d = scanner.nextInt();
            int min = findMin(findMin(a, b), findMin(c, d));
            int max = findMax(findMax(a, b), findMax(c, d));
            System.out.printf("min: %d\nmax: %d", min,max);
        }
        private static int findMin(int a, int b)
        {
            if (a < b)
                return a;
            else
                return  b;
        }
        private static int findMax(int a, int b)
        {
            if (a > b)
                return a;
            else
                return  b;
        }
}
