package by.itland.itjava.timshina.lesson10;

import java.awt.*;

/*public class Room {
    private int x;
    private int y;
    private int z;
    private int win;

    public Room() {
    }


    public Room(int x, int y, int z, int win) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.win = win;
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

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int square1(){
        return 2 * (x * y + y * z + z * x);
    }
    public int square2(){
        return 2 * (x * y + y * z + z * x)-(Door.getH()*Door.getW()+ Window.getH()*Window.getW()*getWin());
    }
    public double repair(){
        return 2 * (y * z + z * x)-(Door.getH()*Door.getW()+Window.getH()*Window.getW()*getWin())/(0.53*10);
    }

}
