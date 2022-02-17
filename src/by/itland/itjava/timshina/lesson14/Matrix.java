package by.itland.itjava.timshina.lesson14;



public class Matrix extends Var {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(String matrix){

        String[] split = matrix.trim().split("(}, \\s*\\{)");
        int countRow = split.length;
        int countCol = split[0].split("\\s*, \\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("\\s*, \\s*");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);
            }
        }
        this.matrix = arr;

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
