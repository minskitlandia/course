package by.itland.itjava.davydovskikh.less15;

public final class Patterns {

    private Patterns() {
    }

    static final String OPERATION = "[-*+/]";
    static final String SCALAR = "-?(\\s*)?\\d+(\\s*)?(\\.\\d+)?";
    static final String VECTOR = "\\{((-?\\d+(\\.\\d+)?)(,?))+}";
    static final String MATRIX = "\\{((\\{((-?\\d+(\\.\\d+)?)(,?))+})(,?))+}";
//{{1,2,3},{4,5,6},{-4.25,8,3}}
}