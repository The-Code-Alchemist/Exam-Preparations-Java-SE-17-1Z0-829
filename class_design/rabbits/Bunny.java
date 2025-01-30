/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 286 - 287
 *
 * The name of a constructor matches the exact case-sensitive name of their class
 * A constructor is a special method thatis called when a new instance is created.
 *
 * Constructors can be overloaded the same way methods are overloaded.
 *
 * A constructor has no return type of any kind, not even void.
 */
package class_design.rabbits;
public class Bunny {
    public Bunny() {
        System.out.println("hop");
    }

//  public bunny() {}      // Not a constructor, because it does not match the case-sensitive class name - will not compile
    public void Bunny() {} // Not a constructor, its return type void makes it a regular method
}
