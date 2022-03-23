package by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.banking;

import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.Developer;
import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.ProjectManager;
import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.ProjectTeamFactory;
import by.itland.itjava.materials.lesson18.patterns.creational.abstraactFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagment();
    }
}
