/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 259
 * Reference Types
 */
package zoo;

public class Pelican {
    public void fly(String s) {
        System.out.print("string");
    }

    public void fly(Object o) {
        System.out.println("object");
    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test");      // finds a direct match and calls the String parameter method
        System.out.print("-");
        p.fly(56);          // autoboxes to Integer and calls the Object parameter
    }
}
