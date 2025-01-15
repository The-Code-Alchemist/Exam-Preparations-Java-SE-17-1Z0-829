/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 261
 * Autoboxing and Unboxing parameters
 * An Integer object is unboxed into primitive integers to be passed into such a method - line 10
 * A primitive int is autoboxed into an Integer object to be passed into such a method - line 13
 */
package methods;
public class Kiwi {
    public void fly(int numFiles) {
        System.out.print("Primitive int");
    }
    public void fly(Integer numFiles) {
        System.out.print("Integer object");
    }

    public static void main(String[] args) {
        // output: Integer object-Primitive int
        var k = new Kiwi();
        k.fly(new Integer(1));
        System.out.print("-");
        k.fly(37);
    }
}
