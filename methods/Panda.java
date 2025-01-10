/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final example
 * final variables must be initialized with a value before they are used.
 */
package methods;

public class Panda {
    final static String name = "Ronda"; // value assigned when declared
    static final int bamboo;            // value assigned at the program's static initializer on line 15
    // static final double height;      // does not compile, not initialized

    // static initializer
    static  { bamboo = 5; }

    public static void main(String[] args) {
        System.out.println(bamboo);
    }
}
