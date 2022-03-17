package by.itland.itjava.naumenko.lesson14_3;

public class CalcException extends Exception {

    private final String message;

    public CalcException() {
        this.message = "Проверьте вводимый формат!!!!";
    }

    public CalcException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
