/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final example
 */
package zoo;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    // static final double height; // does not compile, not initialized

    // static initializer
    static  { bamboo = 5; }

    public static void main(String[] args) {
        System.out.println(bamboo);
    }
}
