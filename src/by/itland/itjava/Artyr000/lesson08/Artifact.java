package by.itland.itjava.Artyr000.lesson08;

public class Artifact {
    long number;
    String culture;
    int century;

    public Artifact(long number){
        this.number = number;
    }
    public Artifact(long number, String culture){
        this.number = number;
        this.culture = culture;
    }
    public Artifact(long number, String culture, int centure){
        this.number = number;
        this.culture = culture;
        this.century = centure;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(15498874);
        Artifact artifact2 = new Artifact(15498874);
        Artifact artifact3 = new Artifact(15498874, "Ацтэки", -8);
        System.out.println(artifact1);
        System.out.println(artifact2);
        System.out.println(artifact3);
    }

}
