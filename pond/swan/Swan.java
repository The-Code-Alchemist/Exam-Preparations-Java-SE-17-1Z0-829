/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 240 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 *
 * A protected member can be used without referring to a variable such as a field or a method.
 * Inheritance is used so protected members of its superclass are accessible
 *
 * A member is used through a variable.
 * Only if it's a subclass, access to protected members is allowed.
 * This leaves out the base class references on lines 28 and 29.
 */
package pond.swan;                          // Different package than pond.shore.Bird
import pond.shore.Bird;
public class Swan extends Bird {            // Swan is a subclass of pond.shoreBird
    public void swim() {
        floatInWater();                     // floating - protected access is OK
        System.out.println(text);           // floating - also from pond.shore.Bird
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();               // subclass access to superclass
        System.out.println(other.text);     // subclass access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();          // variable reference not a Swan!
//        other.floatInWater();           // WILL NOT COMPILE - method not accessible through base class, not in the same package
//        System.out.println(other.text); // WILL NOT COMPILE - same is true for fields
    }

    public static void main(String[] args) {
        new Swan().helpOtherSwanSwim();     // Newly created Swan object calls the helpOtherSwanSwim() method
    }
}
