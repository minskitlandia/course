package by.itland.itjava.Artyr000.lesson10;

import java.util.Scanner;


public class Box {
    private int x;
    private int y;
    private int z;

    public Box() {
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int volumeSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1, sqare\n2, volume");
        int x = scanner.nextInt();
        if (x == 1) {
            return 2 * (x * y + y * z + z * x);
        } else if (x == 2) {
            return x * y * z;
        } else return 0;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public String check() {
        if (x == y && y == z) {
            return "cub";
        } else if (x == 0.5 * y || y == 0.5 * x) {
            return "half cub";
        } else {
            return "parallelepiped";
        }
    }
}