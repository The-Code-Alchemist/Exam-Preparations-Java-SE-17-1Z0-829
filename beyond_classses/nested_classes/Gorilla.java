/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 390
 * Defining an anonymous class outside of a body
 * The anonymous class is implementing the interface
 */
package beyond_classses.nested_classes;
public class Gorilla {
    interface Climb {}
    Climb climbing = new Climb() {};
}
