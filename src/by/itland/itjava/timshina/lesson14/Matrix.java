package by.itland.itjava.timshina.lesson14;



public class Matrix extends Var {
    private double[][] matrix;

    public double[][] getMatrix() {
        return matrix;
    }

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
    public Var add(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.matrix.length == operand2.matrix.length) {
                if (this.matrix[0].length == operand2.matrix[0].length) {
                    double[][] arr = new double[this.matrix.length][this.matrix[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.matrix[i][j] + operand2.matrix[i][j];
                        }

                    }
                    return new Matrix(arr);
                }
            }
        }
        else if (other instanceof  Scalar){
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matrix.length][this.matrix[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = this.matrix[i][j] + operand2.getValue();
                }

            }
            return new Matrix(arr);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.matrix.length == operand2.matrix.length) {
                if (this.matrix[0].length == operand2.matrix[0].length) {
                    double[][] arr = new double[this.matrix.length][this.matrix[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.matrix[i][j] - operand2.matrix[i][j];
                        }

                    }
                    return new Matrix(arr);
                }
            }
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if(other instanceof  Matrix){
            Matrix operand2 = (Matrix)other;
            if (this.matrix[0].length == operand2.matrix.length){
                double[][] matrix = new double [this.matrix.length][operand2.matrix[0].length];
                for (int i = 0; i < this.matrix.length; i++) {
                    for (int j = 0; j < this.matrix[0].length; j++) {
                        for (int k = 0; k < operand2.matrix.length; k++) {
                            matrix[i][j] += this.matrix[i][k] * operand2.matrix[k][j];
                        }
                    }
                }
                return new Matrix(matrix);
            }
        }
        else if (other instanceof Vector){
//            return new Vector();
        } else if (other instanceof Scalar) {
//            return new Matrix();
        }
        return super.mul(other);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        for (int i = 0; i < matrix.length; i++) {
            String del = "";
            String delRow = i != matrix.length - 1 ? "}, {" : "";
            for (int j = 0; j < matrix[i].length; j++) {
                stringBuilder.append(del).append(matrix[i][j]);
                del = ", ";
            }
            stringBuilder.append(delRow);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
