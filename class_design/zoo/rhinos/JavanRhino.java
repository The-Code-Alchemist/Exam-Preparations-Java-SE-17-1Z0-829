/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 309
 * Overriding example with covariant return type
 */
package class_design.zoo.rhinos;
public class JavanRhino extends Rhino {
    // String is a subtype of CharSequence
    // This makes it covariant with the return type CharSequence of the class Rhino
    public String getName() {
        return "java rhino";
    }

    // The overridden getColor() method will not compile with the CharSequence return type
    public String getColor() {
        return "grey";
    }
}
