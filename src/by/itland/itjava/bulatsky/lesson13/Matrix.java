package by.itland.itjava.bulatsky.lesson13;

import java.util.Arrays;

public class Matrix extends Var {

    private double[][] matrix;


    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(Matrix matrix) {
        this.matrix = matrix.matrix;
    }

    public Matrix(String value) {
        String[] split = value.trim().split("(},\\s*\\{)");
        int countRow = split.length;
        int countCol = split[0].split("\\s*,\\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);

            }

        }

        this.matrix = arr;
    }


    @Override
    public String toString() {

//{{0, 1, 2}, {3, 5, 6}, {}}
        StringBuilder stringBuilder = new StringBuilder("{{");

        for (int i = 0; i < matrix.length; i++) {
            String del = "";
            for (int j = 0; j < matrix[0].length; j++) {
                stringBuilder.append(del).append(matrix[i][j]);
                del = ", ";
            }
            stringBuilder.append("}, {");
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
