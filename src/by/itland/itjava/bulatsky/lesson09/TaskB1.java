package by.itland.itjava.bulatsky.lesson09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[^аоуеэяиюёАОУЕЭЯИЮЁ][а-яА-ЯёЁ]*[аоуеэяиюёАОУЕЭЯИЮЁ]$");
        String[] split = Poem.text.split("[\\s+\\p{Punct}]+");
        for (String word : split) {
            Matcher matcher = compile.matcher(word);
            if (matcher.find()) ;
            {
                System.out.println(word);
            }
        }
    }
}
