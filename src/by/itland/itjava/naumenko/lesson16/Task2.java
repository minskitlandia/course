package by.itland.itjava.naumenko.lesson16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        Double[] mas1 = {1.0, 2.0, 3.0, 1.0, 4.0, 5.0, 6.0, 6.0, 6.0, 7.0, 8.0};
        Double[] mas2 = {11.0, 12.0, 13.0, 14.0, 15.0, 6.0, 7.0, 8.0};
        Set<Double> set1 = new LinkedHashSet<>(Arrays.asList(mas1));
        Set<Double> set2 = new HashSet<>(Arrays.asList(mas2));
        set2.add(2.0);
        set2.add(3.0);
        set2.add(5.0);
        set2.add(7.0);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(getCross(set1, set2));
        System.out.println(getUnion(set1, set2));

    }

    private static Set<Double> getUnion(Set<Double> set1, Set<Double> set2) {
        HashSet<Double> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }


    private static Set<Double> getCross(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
