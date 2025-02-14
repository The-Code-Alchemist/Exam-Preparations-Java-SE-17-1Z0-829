/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 315 - 316
 * Abstract classes cannot be insstatiated directly, but their child classes can be.
 * Polymorphism: this is how you can force all objects to have a particular type based on their subtype at runtime.
 *
 * Abstract classes can have both abstract and concrete methods.
 * The abstract methods do not define a method body and have to be overridden by their child classes.
 */
package class_design.zoo.canines;
public class Coyote extends Canine {
    public String getSound() {
        return "Roar!";
    }
}
