/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 365
 * An enum is constructed the first time it is called
 */
package beyond_classses.enum_examples;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.print("constructing,");
    }
}
