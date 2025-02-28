/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 381
 * Two record constructors cannot call each other indefinitely or as a cycle. The constructors have been commented out.
 * Try it out to reproduce the compiler error
 */
package beyond_classses.record_examples;
public record RecursiveCrane(int numberEggs, String name) {
//    public RecursiveCrane(String name) {
//        this(1);
//    }

//    public RecursiveCrane(int numberEggs) {
//        this("");
//    }
}
