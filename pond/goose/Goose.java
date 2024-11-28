/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 241 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 *
 * A protected member can be used without referring to a variable such as a field or a method.
 * Inheritance is used so protected members of its superclass are accessible
 *
 * A member is used through a variable.
 * Only if it's a subclass, access to protected members is allowed.
 * This leaves out the base class references on lines 23 and 24.
 */
package pond.goose;                         // different package than Bird, its import is on the next line
import pond.shore.Bird;
public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Bird();
//        other.floatInWater();               // WILL NOT COMPILE - method not accessible through base class, not in the same package
//        System.out.println(other.text);     // WILL NOT COMPILE - same is true for fields
    }

    public static void main(String[] args) {
        new Goose().helpOtherGooseSwim();
    }
}
