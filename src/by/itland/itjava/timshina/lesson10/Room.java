package by.itland.itjava.timshina.lesson10;

import java.awt.*;

public class Room {
    private int x;
    private int y;
    private int z;
    private Window win;
    private Door door;

    public Room() {
    }


    public Room(int x, int y, int z) {
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

    public Window getWin() {
        return win;
    }

    public void setWin(Window win) {
        this.win = win;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public int square1() {
        return 2 * (x * y + y * z + z * x);
    }

    public int square2() {
        return 2 * (x * y + y * z + z * x) - (door.getH() * door.getW() + win.getH() * win.getW());
    }

    public double repair() {
        return 2 * (y * z + z * x) - (door.getH() * door.getW() + win.getH() * win.getW()) / (0.53 * 10);
    }
}
