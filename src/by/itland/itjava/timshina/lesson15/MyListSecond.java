package by.itland.itjava.timshina.lesson15;

public class MyListSecond<T> {

    private T[] array;
    private int capacity = 10;
    private int current = 0;

    public MyListSecond() {
        this.array = (T[]) new Object[capacity];
    }

    public boolean add(T element) {
        if(current == capacity){
            capacity = (int) (capacity * 1.5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array [current++] = element;
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
            newArr[i] = array[i+1];
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
            if(array[i]!=null) {
                number++;
            }
        }
        return number;
    }
    public boolean toArray(){
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null) {
                number++;
            }
        }
        T[] newArr = (T[]) new Object[number];
        for (int i = 0; i < number; i++) {
            if(array[i]!=null) {
                newArr[i]=array[i];
            }
        }

        array=newArr;

        return true;
    }

   public void add(int index, T element) {
        if (capacity>size() + 1) {
            T[] newArr = (T[]) new Object[capacity + 1];

            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            newArr[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                newArr[i] = array[i - 1];
            }
            array = newArr;

        }

        else {
            capacity = (int) (capacity * 1*5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            newArr[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                newArr[i] = array[i - 1];
            }
            array = newArr;
        }
        current++;
   }

   /*public String add(int index, T element){
         T[] newArr = (T[]) new Object[capacity + 1];
         capacity++;
         for (int i = 0; i < index; i++) {
             newArr[i] = array[i];
         }
         for (int i = index; i < newArr.length; i++) {
             if(i==index){
                 newArr[i] = element;
             }
             else {

                 newArr[i] = array[i+1];
             }
         }
         StringBuilder sb = new StringBuilder("[");
         String del = "";
         for (int i = 0; i < newArr.length; i++) {
             if(newArr[i]!=null) {
                 sb.append(del).append(newArr[i]);
                 del = ", ";
             }
         }
         return sb.append("]").toString();
     }*/
     public boolean set(int index, T element){
         T[] newArr = (T[]) new Object[capacity + 1];
         capacity++;
         for (int i = 0; i < index; i++) {
             newArr[i] = array[i];
         }
         for (int i = index; i < newArr.length; i++) {
             if(i==index){
                 newArr[i] = element;
             }
             else if (i< newArr.length-1){
                 newArr[i+1] = array[i];
             }
         }
         array = newArr;
         return true;
     }
     public int get(T element){
         int number = -1;
         for (int i = 0; i < array.length; i++) {
             if(array[i] == element){
                 number = i;
                 break;
             }
         }
         return number;
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String del = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=null) {
                sb.append(del).append(array[i]);
                del = ", ";
            }
        }
        return sb.append("]").toString();
    }
}
