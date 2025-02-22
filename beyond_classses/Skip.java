/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 357 - 358
 * static interface method example
 */
package beyond_classses;
public class Skip {
    public int skip() {
        // This static method defined in an interface can be access without an instance of a class
        return Hop.getJumpHeight();
    }
}
