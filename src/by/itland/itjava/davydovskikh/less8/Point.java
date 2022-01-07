package by.itland.itjava.davydovskikh.less8;

    public class Point {
         public int x;
        public int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        private double distance (by.itland.itjava.materials.lesson08.Point other){
            return Math.sqrt(Math.pow(other.x-this.x, 2)+Math.pow(other.y-this.y, 2));
        }

        public static void main(String[] args) {
            by.itland.itjava.materials.lesson08.Point pointA = new by.itland.itjava.materials.lesson08.Point(3, 4);
            by.itland.itjava.materials.lesson08.Point pointB = new by.itland.itjava.materials.lesson08.Point(-3, -4);

            System.out.println(pointA.distance(pointB));
        }
    }

