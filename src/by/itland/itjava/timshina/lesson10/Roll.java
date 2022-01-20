package by.itland.itjava.timshina.lesson10;

public class Roll {
    private double up;
    private double down;

    public Roll() {
    }

    public Roll(double up, double down) {
        this.up = up;
        this.down = down;
    }

    public double getUp() {
        return up;
    }

    public void setUp(double up) {
        this.up = up;
    }

    public double getDown() {
        return down;
    }

    public void setDown(double down) {
        this.down = down;
    }

    public double procRoll() {
        return up / down * 100;
    }

    public double sumRoll() {
        int a = 0;
        double newdown = down;
        while (newdown > 9) {
            a = a + (int) newdown % 10;
            newdown = newdown / 10;
        }
        a = a + (int) newdown;
        return a;
    }

    public String checkUp() {
        boolean res = true;
        int prom = 0;
        if (up == 1) {
            return "ne to, ne to";
        } else {
            for (int i = 2; i <= Math.abs(up) / 2; i++) {
                prom = Math.abs((int) up) % i;
                if (prom == 0) {
                    res = false;
                    break;
                }
            }
            if (res) {
                return "prostoe";
            } else {
                return "sostavnoe";
            }
        }
    }

    public void sokrRoll() {
        boolean flag = false;

        do {
            flag = false;
            for (int i = 2; i <= Math.abs(up); i++) {
                if (up % i == 0) {
                    if (down % i == 0) {
                        up = up / i;
                        down = down / i;
                        flag = true;
                        break;
                    }
                }
            }
        } while (flag);
    }
}
