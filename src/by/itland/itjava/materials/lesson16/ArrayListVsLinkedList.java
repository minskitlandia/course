package by.itland.itjava.materials.lesson16;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(10000);
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление в конец ArrayList: " + add(arrayList, 100000, Place.LAST));
        System.err.println("Добавление в конец LinkedList: " + add(linkedList, 100000, Place.LAST));
        System.out.println("Удаление из конца ArrayList: " + remove(arrayList, 10000, Place.LAST));
        System.err.println("Удаление из конца LinkedList: " + remove(linkedList, 10000, Place.LAST));

        System.out.println("--------------------------------------");
        System.err.println("Добавление в середину ArrayList: " + add(arrayList, 100000, Place.MIDDLE));
        System.out.println("Добавление в середину LinkedList: " + add(linkedList, 100000, Place.MIDDLE));
        System.err.println("Удаление из середины ArrayList: " + remove(arrayList, 10000, Place.MIDDLE));
        System.out.println("Удаление из середины LinkedList: " + remove(linkedList, 10000, Place.MIDDLE));

        System.out.println("--------------------------------------");
        System.err.println("Добавление в начало ArrayList: " + add(arrayList, 100000, Place.FIRST));
        System.out.println("Добавление в начало LinkedList: " + add(linkedList, 100000, Place.FIRST));
        System.err.println("Удаление из начала ArrayList: " + remove(arrayList, 10000, Place.FIRST));
        System.out.println("Удаление из начала LinkedList: " + remove(linkedList, 10000, Place.FIRST));

    }

    private static long add(List<Integer> list, int count, Place place) {
        Date date = new Date();
        long start = date.getTime();
        if (place == Place.LAST) {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        } else if (place == Place.MIDDLE) {
            for (int i = 0; i < count; i++) {
                list.add(150, i);
            }
        } else {
            for (int i = 0; i < count; i++) {
                list.add(0, i);
            }
        }
        Date date2 = new Date();
        long end = date2.getTime();
        return end - start;
    }

    private static long remove(List<Integer> list, int count, Place place) {
        Date date = new Date();
        long start = date.getTime();
        if (place == Place.LAST) {
            for (int i = 0; i < count; i++) {
                list.remove(list.size() - 1);
            }
        } else if (place == Place.MIDDLE) {
            for (int i = 0; i < count; i++) {
                list.remove(150);
            }
        } else {
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
        }
        Date date2 = new Date();
        long end = date2.getTime();
        return end - start;
    }
}
