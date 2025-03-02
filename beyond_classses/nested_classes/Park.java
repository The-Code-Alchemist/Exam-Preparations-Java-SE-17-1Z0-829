/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 386 - 387
 * Creating a static nested class Ride within Park
 * Line 14 instantiates the nested class Ride. Since the class is static,
 * you do not need an instance of the enclosing class Park
 */
package beyond_classses.nested_classes;
public class Park {
    static class Ride {
        private int price = 6;
    }
    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);     // private field price can be accessd
    }
}