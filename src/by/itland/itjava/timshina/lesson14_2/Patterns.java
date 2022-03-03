package by.itland.itjava.timshina.lesson14_2;

public final class Patterns {
    private Patterns(){}

    static final String OPERATION = "[-+/*]";
    static final String SCALAR = "-?(\\s*)?\\d+(\\s*)?(\\.\\d+)?";
    static final String VECTOR = "\\{((-?\\d+(\\.\\d+)?)(,?))+}";
    //{{-3,2,1},{2,3,4},{5,6,-7}}
    static final String MATRIX = "\\{(\\{((-?\\d+(\\.\\d+)?)(,?))+}(,?))+}";



}
