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
 * This leaves out the base class references on line 19.
 */
package pond.duck;
import pond.goose.Goose;
import pond.shore.Bird;
public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater();   // WILL NOT COMPILE - we're not in the Goose object
    }

    public static void main(String[] args) {
        new GooseWatcher().watch();
    }
}
