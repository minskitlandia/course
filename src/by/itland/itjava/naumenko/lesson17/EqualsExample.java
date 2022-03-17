package by.itland.itjava.naumenko.lesson17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EqualsExample {
    public static void main(String[] args) {
        Dog tuzik = new Dog("Тузик", 5);
        Dog bobik = new Dog("Бобик", 3);
        Dog pоlkan = new Dog("Полкан", 10);
        Dog tuzik2 = new Dog("Тузик", 5);

        System.out.println(5 == 3);
        System.out.println(tuzik);
        System.out.println(tuzik2);
        System.out.println(tuzik.equals(tuzik2));
//        System.out.println(tuzik > bobik);

        List<Dog> dogs = new ArrayList<>(){{
            add(tuzik);
            add(tuzik2);
            add(bobik);
            add(pоlkan);
        }};

        System.out.println(dogs);

        dogs.sort(new DogComparator());
        System.out.println(dogs);

        dogs.sort(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(dogs);

    }
}
