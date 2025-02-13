/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 314
 * final methods of a parent class cannot be overridden by the child class
 * However, the overridden method is allowed to be final if the parent is not.
 */
package class_design.zoo.birds;
class Bird {
    // Child class Penguin will not compile if the methods in this class are marked final. Try it out.
    public boolean hasFeathers() {
        return true;
    }
    public static void flyAway() {}
}

public class Penguin extends Bird {
    // The overridden method on the other hand, can be made final
    public final boolean hasFeathers() {
        return false;
    }
    public final static void flyAway() {}
}

