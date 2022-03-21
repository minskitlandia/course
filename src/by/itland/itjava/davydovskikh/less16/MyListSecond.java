package by.itland.itjava.davydovskikh.less16;

public class MyListSecond<T> {
    private T[] array;
    private int capacity = 10;
    private int current = 0;

    public MyListSecond() {
        this.array = (T[]) new Object[0];
    }

    public boolean add(T element) {
        if(current==capacity){
            capacity = (int) (capacity *1.5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array=newArr;
        }
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
    public int getCapacity(){
        return array.length;
    }
    public int size(){
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null){
                number++;
            }
        }
        return number;
    }

//    public boolean toArray(){
//
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < (array.length - 1))
                sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
