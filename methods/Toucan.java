/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 261 - 262
 * An array and a varargs parameter are seen as the same method signature by Java which is not allowed
 * There is a difference however:
 * Separate int parameters can only be passed as parameters to the method with the varargs parameter, which will not work with arrays
 * An array as aparameter can use either of the two methods in this class
 */
package methods;
public class Toucan {
//    public void fly (int[] lengths) {
//        System.out.println("array");
//    }    // Essentially the same signature as the next method
    public void fly (int... lengths) {
        System.out.println("vararg");
    }     // varargs are treated as an array, same signature as the previous method

    public static void main(String[] args) {
        var t = new Toucan();
        t.fly(new int[] {1, 2, 3}); // This array can call either method
        t.fly(1, 2, 3);      // Stand-alone  call the varargs method, will not compile when used with an array
    }
}
