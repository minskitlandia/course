package by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.banking;

import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.ProjectManager;

public class ProjectManagment implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Pm work");
    }

}
