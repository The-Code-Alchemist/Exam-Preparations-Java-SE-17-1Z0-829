/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 311
 * private methods cannot be overridden, because they are not inherited
 */
package class_design.zoo.bugs;
public class RhinocerosBeetle extends Beetle {
    // Parent class Beetle has an unrelated method getSize of another return type
    private int getSize() {
        return 5;
    }
}
