/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 234
 * vararg example
 */
package methods;
public class DogWalker {
    private static void walkDog(int start, int... steps) {

    }

    public static void main(String[] args) {
        walkDog(1);                     // array of length 0
        walkDog(1, 2);           // array of length 1
        walkDog(1, 2, 3);        // array of length 2
        walkDog(1, new int[] {4 ,5});   // array of length 2
    }
}