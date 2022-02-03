package by.itland.itjava.timshina.lesson11.Human;

public class Student extends Human {
    private String study;
    private boolean sideJob;

    public Student(int age, String name, String study, boolean sideJob) {
        super(age, name);
        this.study = study;
        this.sideJob = sideJob;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public boolean isSideJob() {
        return sideJob;
    }

    public void setSideJob(boolean sideJob) {
        this.sideJob = sideJob;
    }

    @Override
    public double earnings() {
        return sideJob ? Math.random() * 30 + 20 : 0;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age " + getAge() +
                ", name " + getName() +
                ", study " + study +
                ", sideJob " + sideJob +
                '}';
    }
}
