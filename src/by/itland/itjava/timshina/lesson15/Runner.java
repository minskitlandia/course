package by.itland.itjava.timshina.lesson15;

public class Runner {
    public static void main(String[] args) {
        /*MyClassInteger myClassInteger = new MyClassInteger(5, 6);
        MyClassDouble myClassDouble = new MyClassDouble(5.0, 6.0);
        MyClassString myClassString = new MyClassString("пять", "шесть");

        System.out.println(myClassInteger);
        System.out.println(myClassDouble);
        System.out.println(myClassString);

        MyClassGeneric<Integer>  myClassGeneric1 = new MyClassGeneric<>(5, 6);
        System.out.println(myClassGeneric1);*/

        /*MyListFirst<Integer> myListFirstInteger = new MyListFirst<>();
        myListFirstInteger.add(5);
        myListFirstInteger.add(2);
        myListFirstInteger.add(3);
        myListFirstInteger.add(1);

        System.out.println(myListFirstInteger);
        System.out.println(myListFirstInteger.get(2));
        myListFirstInteger.remove(3);
        System.out.println(myListFirstInteger);*/

        MyListSecond<Integer> myListSecondInteger = new MyListSecond<>();
        myListSecondInteger.add(5);
        myListSecondInteger.add(2);
        myListSecondInteger.add(3);
        myListSecondInteger.add(1);

        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.get(2));
        myListSecondInteger.remove(3);
        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.getCapacity());
        System.out.println(myListSecondInteger.size());
        System.out.println(myListSecondInteger.toArray());
        System.out.println(myListSecondInteger);
        /*myListSecondInteger.add(1, 1);
        System.out.println(myListSecondInteger);*/
    //  System.out.println(myListSecondInteger.add(1, 1));
        //нельзя изменить размер массива :\ (новый выводить прямо в методе тоже не хочет)
        myListSecondInteger.set(1, 1);
        System.out.println(myListSecondInteger);
        System.out.println(myListSecondInteger.get(1));
        //мой метод get(T) не хочет использоваться
    }
}
