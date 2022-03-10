package by.itland.itjava.naumenko.lesson14_3;

public class Matrix extends Var {

    private double[][] value;

    public double[][] getValue() {
        return value;
    }

    public Matrix(double[][] value) {
        this.value = value;
    }

    public Matrix(Matrix matrix) {
        value = matrix.value;
    }

    public Matrix(String value) {

<<<<<<< HEAD
        String[] split = value.trim().split("(}\\s*,\\s*\\{)");
=======
        String[] split = value.trim().split("(},\\s*\\{)");
>>>>>>> origin/master
        int countRow = split.length;
        int countCol = split[0].split("\\s*,\\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("\\s*,\\s*");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);
            }
        }
        this.value = arr;
    }


    @Override
    public Var add(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.value.length == operand2.value.length) {
                if (this.value[0].length == operand2.value[0].length) {
                    double[][] arr = new double[this.value.length][this.value[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.value[i][j] + operand2.value[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }

        } else if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = this.value[i][j] + operand2.getValue();
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
            if (this.value.length == operand2.value.length) {
                if (this.value[0].length == operand2.value[0].length) {
                    double[][] arr = new double[this.value.length][this.value[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.value[i][j] - operand2.value[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }

        } else if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.value.length][this.value[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = this.value[i][j] - operand2.getValue();
                }
            }
            return new Matrix(arr);
        }
        return super.add(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.value[0].length == operand2.value.length) {
                double[][] arr = new double[this.value.length][operand2.value[0].length];
                for (int i = 0; i < this.value.length; i++) {
                    for (int j = 0; j < operand2.value[0].length ; j++) {
                        for (int k = 0; k < operand2.value.length; k++) {
                            arr[i][j] += this.value[i][k]*operand2.value[k][j];
                        }
                    }
                }
                return new Matrix(arr);
            }

        } else if (other instanceof Scalar) {
            //код
//            return new Matrix();
        }
        return super.mul(other);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        for (int i = 0; i < value.length; i++) {
            String del = "";
//            String delRow = i != value.length - 1 ? "}, {" : "";
            for (int j = 0; j < value[i].length; j++) {
                stringBuilder.append(del).append(value[i][j]);
                del = ", ";
            }
            //stringBuilder.append(delRow);
            if (i != value.length - 1) {
                stringBuilder.append("}, {");
            }
        }
        stringBuilder.append("}}");

        return stringBuilder.toString();
    }


}
