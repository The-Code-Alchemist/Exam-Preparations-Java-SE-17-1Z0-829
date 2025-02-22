/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 357 - 358
 * static interface method example
 */
package beyond_classses;
public interface Hop {
    // This method works like a static method as defined in a class. It can be accessed without an instance of a class.
    static int getJumpHeight(){
        return 8;
    }
}
