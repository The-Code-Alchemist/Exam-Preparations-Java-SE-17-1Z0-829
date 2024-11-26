/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 233
 * Some methods with vararg parameters
 * A method can at most have one varargs parameter passed to it, the last one. Otherwise, the method will not compile.
 */
package methods;
public class VisitAttractions {

    public static void main(String[] args) {

        /**
         * When calling a method with a varargs parameter, you can pass in an array
         */
        int[] data = new int[] {1, 2, 3};
        walk1(data);

        /**
         * When calling a method with a varargs parameter, you can list the elements of the array and let Java create it for you
         */
        walk1(1, 2, 3);

        /**
         * When you omit the varargs values in the method call altogether, Java will create an empty array of length zero
         */
        walk1();
    }

    // walk1 made static in order to call it from the main method
    public static void walk1(int... steps) {
        int[] step2 = steps;    // not necessary, but shows steps is of type int[]
        System.out.println(step2.length);
    }
    public void walk2(int start, int... steps) {}
//    public void walk3(int... steps, int start) {}     // will not compile, only the last parameter can be a vararg
//    public void walk4(int... steps, int... start) {}  // will not compile, only one vararg parameter allowed - the last
}
