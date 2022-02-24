package by.itland.itjava.bulatsky.lesson14_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Var calculator(String text) {
        String[] operands = text.trim().split(Patterns.OPERATION);
        Var leftOperand = Var.createVar(operands[0]);
        Var rightOperand = Var.createVar(operands[1]);

        Pattern pattern = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String operation = matcher.group();
            switch (operation) {
                case "+":
                    return leftOperand.add(rightOperand);
                case "-":
                    return leftOperand.add(rightOperand);
                case "*":
                    return leftOperand.add(rightOperand);
                case "/":
                    return leftOperand.add(rightOperand);
            }

        }
        return null;
    }
}
