package by.itland.itjava.materials.lesson18.patterns.structure.bridgeMOST;

public abstract class Program {

    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
