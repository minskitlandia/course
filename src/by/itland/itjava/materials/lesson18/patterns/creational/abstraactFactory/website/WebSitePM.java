package by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.website;

import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.ProjectManager;

public class WebSitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Pm work webSite");
    }

}
