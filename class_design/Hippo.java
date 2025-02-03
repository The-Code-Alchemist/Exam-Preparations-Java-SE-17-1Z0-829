/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 297 - 298
 * Initializing Objects
 */
package class_design;
public class Hippo extends Animal {
    public Hippo(int age) {
        super(age);
    }

    public static void main(String[] args) {
        System.out.print("C");          // executed third after both static initialization blocks
        new Hippo(1);
        new Hippo(2);
        new Hippo(3);
    }
    static { System.out.print("B"); }   // executed second as a subclass
}
