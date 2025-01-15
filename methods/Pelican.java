/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 259 - 260
 * Overloading reference types: Java picks the most specific version of a method that it can
 */
package methods;
public class Pelican {
    public void fly(String s) {
        System.out.print("string");
    }

    public void fly(Object o) {
        System.out.print("object");
    }

    public static void main(String[] args) {
        // output: string-object
        var p = new Pelican();
        p.fly("test");          // method with the String parameter is called, a direct match
        System.out.print("-");
        p.fly(56);              // method with the Object parameter is called, the primitive int is autoboxed to
    }
}
