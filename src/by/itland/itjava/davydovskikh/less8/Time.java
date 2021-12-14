package by.itland.itjava.davydovskikh.less8;

public class Time {

    int hour;
    int min;
    int sec;

    public Time(int hour, int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public Time(int sec){
        this.hour = sec/3600;
        this.min=(sec % 3600) / 60;
        this.sec=(sec % 3600) % 60;
    }

    private void getTime(){
        System.out.printf("%d:%d:%d\n", this.hour,this.min, this.sec);
    }


    public static void main(String[] args) {
        Time time = new Time(5,76,100);
        //Time time2= new
    }
}
