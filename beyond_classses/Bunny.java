/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 357 - 358
 * static interface method example
 */
package beyond_classses;
public class Bunny implements Hop {
    public void printDetails() {

        System.out.println(Hop.getJumpHeight());
        /**
         * The previous method call compiles fine, there is an explicit reference to the interface Hop
         * The following method call will not compile without an explicit reference to the interface - commented out
         */
        // System.out.println(getJumpHeight());
    }
}