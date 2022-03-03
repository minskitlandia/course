package by.itland.itjava.timshina.lesson14_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Var calculate(String text){
        String[] operands = text.trim().split(Patterns.OPERATION);
        Var leftOperand = Var.createVar(operands[0]);
        Var rightOperand = Var.createVar(operands[1]);

        Pattern pattern = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            String operation = matcher.group();
            switch (operation){
                case "+": return leftOperand.add(rightOperand);
                case "-": return leftOperand.sub(rightOperand);
                case "*": return leftOperand.mul(rightOperand);
                case "/": return leftOperand.div(rightOperand);
            }

        }
        return null;
    }
}
