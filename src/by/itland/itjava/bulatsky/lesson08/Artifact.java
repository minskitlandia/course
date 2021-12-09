package by.itland.itjava.bulatsky.lesson08;

public class Artifact {
    long number;
    String culture;
    int century;
     public Artifact(long number) {
         this.number=number;

     }
     public Artifact(long number, String culture){
         this.number=number;
         this.culture=culture;

     }
     public Artifact(long number, String culture, int century) {
         this.number=number;
         this.culture=culture;
         this.century=century;
     }

    @Override
    public String toString() {
        return "Artifact{" +
                "number=" + number +
                ", culture='" + culture + '\'' +
                ", century=" + century +
                '}';
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(43);
        Artifact artifact2 = new Artifact(43,"Ацтэки");
        Artifact artifact3 = new Artifact(43,"Ацтэки",4);
        System.out.println(artifact1);
        System.out.println(artifact2);
        System.out.println(artifact3);
     }
}
