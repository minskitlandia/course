package by.itland.itjava.timshina.lesson15;

public class Runner {
    public static void main(String[] args) {
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
        System.out.println(myListSecondInteger);
        myListSecondInteger.add(1, 1);
        System.out.println(myListSecondInteger);

        myListSecondInteger.set(2, 1);
        System.out.println(myListSecondInteger);
        //System.out.println(myListSecondInteger.get(1));
        //мой метод get(T) не хочет использоваться
    }
}
