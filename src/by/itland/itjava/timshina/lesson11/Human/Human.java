package by.itland.itjava.timshina.lesson11.Human;

public abstract class Human {
    private int age;
    private String name;
    private boolean SideJob = false;

    public Human(int age, String name) {
    }


    public abstract double earnings();

    public Human(int age, String name, boolean sideJob) {
        this.age = age;
        this.name = name;
        SideJob = sideJob;
    }

    public boolean isSideJob() {
        return SideJob;
    }

    public void setSideJob(boolean sideJob) {
        SideJob = sideJob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age " + age +
                ", name " + name  +
                '}';
    }

    public abstract double earnings1();
}
