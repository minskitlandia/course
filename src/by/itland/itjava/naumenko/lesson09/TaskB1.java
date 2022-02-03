package by.itland.itjava.naumenko.lesson09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    public static void main(String[] args) {
        String[] split = Poem.text.split("[\\s\\p{Punct}]+");
        Pattern pattern = Pattern.compile("^[^аеёиоуыэюяАЕЁИОУЫЭЮЯ][а-яё]+[аеёиоуыэюя]$");
        for (String word : split) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }
}
