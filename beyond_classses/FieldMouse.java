/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 348
 * Interfaces introduced: a class can implement any number of interfaces
 * @Override annotation recommended to ensure you implement the method properly
 */
package beyond_classses;
public class FieldMouse implements Climb, CanBurrow {
    // Method overridden from the Climb interface
    @Override
    public Number getSpeed(int age) {
        return 11f;
    }
}
