package by.itland.itjava.naumenko.lesson10;

public class Roll {
    private int numerator;
    private int denominator;

    public Roll() {
    }

    public Roll(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double percentage() {
        return (numerator / (double) denominator) * 100;
    }

    public boolean checkSimpleNumerator() {
        for (int i = 2; i < (int) Math.sqrt(Math.abs(numerator)); i++) {
            if (numerator % i == 0)
                return false;
        }
        return true;
    }

    public int sumDenominator() {
        int den = denominator;
        int sum = 0;
        while (den > 9) {
            sum += den % 10;
            den /= 10;
        }
        sum += den;
        return sum;
    }

    public void reduce() {
        boolean flag = false;
        if (checkSimpleNumerator()) {
            if (denominator % numerator == 0) {
                denominator /= numerator;
                numerator /= numerator;
            }
        } else {
            do {
                flag = false;
                for (int i = 2; i <= Math.abs(numerator); i++) {
                    if (numerator % i == 0) {
                        if (denominator % i == 0) {
                            numerator /= i;
                            denominator /= i;
                            flag = true;
                            break;
                        }
                    }
                }
            } while (flag);
        }
    }

    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
