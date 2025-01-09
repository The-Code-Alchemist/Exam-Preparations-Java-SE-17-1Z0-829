/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 244
 * Illustrating a static variable and method
 * The main method can be called like any static method
 */
package methods;
public class Koala {
    static int count = 0;                       // static variable
    public static void main(String[] args) {    // static method
        System.out.println(count);
    }
}
