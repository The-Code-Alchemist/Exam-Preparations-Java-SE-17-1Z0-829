/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 234
 * varargs example
 */
package methods;
public class DogWalker {
    private static void walkDog(int start, int... steps) {
        System.out.print("First parameter " + start + " ");
        System.out.println("Varargs array length " + steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);                    // array of length 0
        walkDog(1, 2);          // array of length 1
        walkDog(1, 2, 3);       // array of length 2
        walkDog(1, new int[] {4 ,5});  // array of length 2

        /**
         * null can be passed explicitly as a varargs parameter e.g. of type int
         * Although the code compiles, the program throws a NullPointerException at runtime
         * This is because the length of null can't be determined
         */
        walkDog(1, null);
    }
}