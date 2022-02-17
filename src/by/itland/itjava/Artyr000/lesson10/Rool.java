package by.itland.itjava.Artyr000.lesson10;

public class Rool {

    private int up;
    private int down;
    public Rool() {
    }

    public Rool(int up, int down) {
        this.up = up;
        this.down = down;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public double percentage(){
        return (up/(double)down)*100;
    }

    public  boolean checkSimpleNumerator(){
        for (int i = 2; i< (int) Math.abs((up));i ++) {
            if (up % i == 0)
                return  false;
        }
        return  true;
    }

    public  int sumDenominator(){
        int den = down;
        int sum = 0;
        while (den > 9) {
            sum += den %10;
            den /= 10;
        }
        return sum;
    }

    public void reduce() {
    }
}
