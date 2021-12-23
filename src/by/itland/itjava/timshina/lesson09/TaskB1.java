package by.itland.itjava.timshina.lesson09;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        String[] split = Poem.text.split("[\\s\\p{Punct}]+");
        Pattern compile = Pattern.compile("^[^уеыаоэяиюёУЕЫАОЭЯИЮЁ][а-яё]+[уеыаоэяиюёУЕЫАОЭЯИЮЁ]$");
        for (String word : split){
            Matcher matcher = compile.matcher(word);
            if(matcher.find()){
                System.out.println(word);
            }
        }
    }
}
