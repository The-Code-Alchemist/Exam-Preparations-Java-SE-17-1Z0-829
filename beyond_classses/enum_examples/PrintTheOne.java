/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 365
 *
 * The first time we ask for any enum values, Java constructs all the enum values
 * After that, JAva just returns the already constructed enum values
 */
package beyond_classses.enum_examples;
public class PrintTheOne {
    public static void main(String[] args) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE;   // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE;  // Doesn't print anything
        System.out.print("end");
    }
}
