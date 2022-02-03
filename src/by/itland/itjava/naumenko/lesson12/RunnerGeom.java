package by.itland.itjava.naumenko.lesson12;



public class RunnerGeom {
    public static void main(String[] args) {
        Geom[] geoms = new Geom[5];
        geoms[0] = new Line();
        geoms[1] = new Triangle();
        geoms[2] = new Rectangle();
        geoms[3] = new Cube();
        geoms[4] = new Parallelepiped();

        for (Geom item : geoms) {
            item.draw();
            if (item instanceof CalcGeom){
                ((CalcGeom) item).calculateAria();
            }
            if (item instanceof CalcVolume){
                ((CalcVolume) item).getVolume();
            }
        }
    }
}
