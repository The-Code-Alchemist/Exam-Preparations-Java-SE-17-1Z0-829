/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 309
 * Overriding example with covariant return type
 */
package class_design.zoo.rhinos;
public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    }
}
