package by.itland.itjava.timshina.lesson11.Human;

import java.util.Random;

public class Employee extends Human{
    private double salary;
    private String company;

    public Employee(int age, String name, double salary, String company) {
        super(age, name);
        this.salary = salary;
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public double earnings(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age " + getAge() +
                ", name " + getName() +
                ", salary=" + salary +
                ", company= " + company  +
                '}';
    }

}
