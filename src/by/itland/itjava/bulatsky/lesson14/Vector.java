package by.itland.itjava.bulatsky.lesson14;


public class Vector extends Var {
    private double[] value;


    public Vector(double[] value) {
        this.value = value;
    }

    public double[] getValue() {
        return value;
    }

    public void setValue(double[] value) {
        this.value = value;
    }

    public Vector(String value) {
        String s = value.replaceAll("[{,}]", " ");
        s = s.trim();
        String[] split = s.split("\\s+");
        double[] arr = new double[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(split[i]);
        }
        this.value = arr;
    }

    public Vector(Vector vector) {
        this.value = vector.value;

    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] + operand2.getValue();
            }
            return new Vector(result);
        } else if (other instanceof Vector) {
            Vector operand2 = (Vector) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] + operand2.value[i];
            }
            return new Vector(result);
        }
        return other.add(other);
    }

    public Var sub(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] - operand2.getValue();
            }
            return new Vector(result);
        } else if (other instanceof Vector) {
            Vector operand2 = (Vector) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] - operand2.value[i];
            }
            return new Vector(result);
        }
        return other.add(this);
    }

    public Var mul(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] * operand2.getValue();
            }
            return new Vector(result);
        } else if (other instanceof Vector) {
            Vector operand2 = (Vector) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] * operand2.value[i];
            }
            return new Vector(result);
        }
        return other.add(this);
    }

    public Var div(Var other) {
        if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] / operand2.getValue();
            }
            return new Vector(result);
        } else if (other instanceof Vector) {
            Vector operand2 = (Vector) other;
            double[] result = new double[this.value.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = this.value[i] / operand2.value[i];
            }
            return new Vector(result);
        }
        return other.add(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String del = "";
        for (int i = 0; i < value.length; i++) {
            sb.append(del).append(value[i]);
            del = ", ";

        }
        sb.append("}");
        return sb.toString();
    }
}
