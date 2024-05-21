/**
 * @author The Code Alchemist
 * from Chapter 2: Operators, page 76
 * Numeric promotion examples
 */
public class NumericPromotion {
    public static void main(String[] args) {
        int a = 1;
        long b = 33;
        var c = a * b;      // c gets promoted to the data type long assigned to it through inference
        System.out.println(c);

        double d = 39.21;
        float e = 2.1F;     // don't forget the F at the end or you'll get
        var f = d + e;      // f gets promoted to the data type double assigned to it through inference
        System.out.println(f);

        short g = 10;
        short h = 3;
        var i = g * h;      // i gets promoted to the data type int assigned to it through inference
        System.out.println(i);

        short w = 14;
        float x = 13;
        double y = 30;
        /**
         * 1. w gets promoted to int, w * x is a float
         * 2. w * x / y
         */
        var z = w * x / y;  // z gets promoted to the data type double assigned to it through inference
        System.out.println(z);
    }
}
