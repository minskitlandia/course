package by.itland.itjava.materials.lesson18.patterns.structure.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer =new JavaTeamLead( new SeniorJavaDeveloper(new  JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
