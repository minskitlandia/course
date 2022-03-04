package by.itland.itjava.naumenko.lesson15;

import java.util.Arrays;

public class MyListFirst<T> {

    private T[] array;
    private int capacity = 0;

    public MyListFirst() {
        this.array = (T[]) new Object[0];
    }

    public boolean add(T element) {
        T[] newArr = (T[]) new Object[capacity + 1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[capacity++] = element;
        array = newArr;
//        capacity++;

        return true;
    }

    public T get(int index) {
        return array[index];
    }

    public void remove(int index) {
        T[] newArr = (T[]) new Object[capacity - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = array[i + 1];
        }
        array = newArr;
        capacity--;
    }

    //    [0, 1, 2, 3]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String del = "";
        for (int i = 0; i < array.length; i++) {
            sb.append(del).append(array[i]);
            del = ", ";
        }
        return sb.append("]").toString();
    }
}
