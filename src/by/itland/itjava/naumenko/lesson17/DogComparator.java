package by.itland.itjava.naumenko.lesson17;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
