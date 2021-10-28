package by.itland.itjava.naumenko.lesson04;

import java.util.Scanner;

class TestIfExample {

    static int c =5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int b = 3;
        System.out.println(c);
        System.out.println(b);
        switchDay(i);
        //@formatter:off

//        default: System.out.println("error");break;
        }

       public static void switchDay(int day){
            switch (day){
                case 1: System.out.println("понедельник");break;
                case 2: System.out.println("вторник");break;
                case 3: System.out.println("среда");break;
                case 4: System.out.println("четверг");break;
                case 5: System.out.println("пятница");break;
                case 6: System.out.println("суббота");break;
                case 7: System.out.println("воскресенье");break;
        }
        System.out.println(c);
        //@formatter:on












//        else if (i == 2)
//            System.out.println("вторник");
//        else if (i == 3)
//            System.out.println("среда");
//        else if (i == 4)
//            System.out.println("четверг");
//        else if (i == 5)
//            System.out.println("пятница");
//        else if (i == 6)
//            System.out.println("суббота");
//        else if (i == 7)
//            System.out.println("воскресенье");
//        else {
//            System.out.println("ERROR");
//        }
    }


}
