package by.itland.itjava.naumenko.lesson15;

import by.itland.itjava.naumenko.lesson14_3.Matrix;

public class Runner {

    public static void main(String[] args) {
        MyListSecond<Integer> myListSecondInteger = new MyListSecond<>();
        myListSecondInteger.add(5);
        myListSecondInteger.add(2);
        myListSecondInteger.add(3);
        myListSecondInteger.add(1);

        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.get(2));
        myListSecondInteger.remove(3);
        myListSecondInteger.remove(1);
        System.out.println(myListSecondInteger);
    }
}
