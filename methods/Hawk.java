/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 258
 *
 * An example of identical method signatures - the methods on lines 9, 10 and 11
 * access modifiers do NOT change a method's signature, such as public, private and static
 *
 * In order to overload methods properly, use these instead:
 * A different number of parameters
 * A different order of the same parameters, provided they are of the same type
 */
package methods;
public class Hawk {
    public void fly(int numFiles) {}
//    public static void fly(int numFiles) {} // DOES NOT COMPILE
//    public void fly(int numFiles) {}        // DOES NOT COMPILE
}
