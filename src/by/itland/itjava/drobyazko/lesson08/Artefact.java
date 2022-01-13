package by.itland.itjava.drobyazko.lesson08;

public class Artefact {
    long number;
    String culture;
    int century;

    public Artefact (long number){
        this.number = number;
    }
    public Artefact (long number, String culture){
        this.number = number;
        this.culture = culture;
    }
    public Artefact (long number, String culture, int century){
        this.number = number;
        this.culture = culture;
        this.century = century;
    }



    public static void main(String[] args) {
        Artefact artefact1 = new Artefact(3456);
        Artefact artefact2 = new Artefact(3456, "Ацтеки");
        Artefact artefact3 = new Artefact(3456, "Ацтеки", -8);
        System.out.println(artefact1);
        System.out.println(artefact2);
        System.out.println(artefact3);


    }
}
