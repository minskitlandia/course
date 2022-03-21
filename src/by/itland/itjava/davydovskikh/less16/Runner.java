package by.itland.itjava.davydovskikh.less16;

public class Runner {
    public static void main(String[] args) {
//        MyClassDouble myClassDouble = new MyClassDouble(5.0,6.0);
//        MyClassInteger myClassInteger = new MyClassInteger(5,6);
//        MuClassString muClassString = new MuClassString("пять","шесть");
//
//        System.out.println(muClassString);
//        System.out.println(myClassDouble);
//        System.out.println(myClassInteger);
//
//        MyClassGeneric<Integer> myClassGeneric = new MyClassGeneric<>(5,6);
//        System.out.println(myClassGeneric);

        MyListSecond<Integer> myListSecondInteger = new MyListSecond<>();
        myListSecondInteger.add(5);
        myListSecondInteger.add(3);
        myListSecondInteger.add(2);
        myListSecondInteger.add(1);

        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.get(2));
        myListSecondInteger.remove(3);
        System.out.println(myListSecondInteger);
    }
}
