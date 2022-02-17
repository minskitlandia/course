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

   @Override
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
      return super.sub(other);
     }

//     @Override
//    public Var mul(int[] arr1, int[] arr2) {
//
//      if ( instanceof Scalar){
//          Scalar operand2 = (Scalar) other;
//          double[] result = new double[this.value.length];
//          for (int i = 0; i < result.length; i++) {
//              result[i] = this.value[i] * operand2.getValue();
//          }
//          return new Vector(result);
//
//          int col = Math.min(arr1.length, arr2.length);
//          int res = 0;
//          for (int i = 0; i < col; i++) {
//              res += arr1[i] * arr2[i];
//          }
//
//
//          return res;
//      }
//    }
//
//
//    @Override
//    public Var div(int[] arr1, int[] arr2) {
//      if ( instanceof Scalar){
//          Scalar operand2 = (Scalar) other;
//          double[] result = new double[this.value.length];
//          for (int i = 0; i < result.length; i++) {
//              result[i] = this.value[i] / operand2.getValue();
//          }
//          return new Vector(result);
//
//
//          int col = Math.min(arr1.length, arr2.length);
//          int res = 0;
//          for (int i = 0; i < col; i++) {
//              res += arr1[i] / arr2[i];
//          }
//          return res;
//      }
//    }
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
