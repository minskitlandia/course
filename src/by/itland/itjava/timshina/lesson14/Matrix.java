package by.itland.itjava.timshina.lesson14;



public class Matrix extends Var {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(String matrix){
        matrix = matrix.replaceAll("[},{]", " ");
        matrix = matrix.trim();
        String[] matrix1 = matrix.split("");
        String[] matrix2 = matrix1[0].split("\\s+");
        int stolbik = matrix2.length;
        int stroka = matrix1.length;
        String[] matrixend = matrix.split("\\s+");
        int n = 0;
        double[][] matrixend1 = new double[stolbik][stroka];
        for (int i = 0; i < matrixend1.length; i++) {
            for (int j = 0; j < matrixend1[i].length; j++) {
                matrixend1[i][j] = Double.parseDouble(matrixend[n]);
                n++;
            }
        }
        this.matrix =  matrixend1;
    }

    public Matrix(Matrix matrix){
        this.matrix = matrix.matrix;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        String del = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                stringBuilder.append(del).append(matrix[i][j]);
                del = ", ";
            }
            if(i<matrix.length-1) {
                stringBuilder.append("}, {");
            }
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
