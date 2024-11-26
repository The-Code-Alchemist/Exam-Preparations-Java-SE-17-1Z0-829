/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 230 - 231
 * Effectively final examples
 *
 * An effectively final local variable is one that does not change after it has been set,
 * regardless of whether it is explicitly marked as final.
 *
 * If you are not sure whether a local variable is effectively, just add the keyword final.
 * If the code still compiles, the variable is effectively final.
 */
package methods;
public class EffectivelyFinalExample {
    public static void main(String[] args) {
        zooFriends();
    }

    private static String zooFriends() {
        final String name = "Harry the Hippo";  // effectively final
        var size = 10;
        final boolean wet;                      // effectively final
        if(size > 100) size++;
        name.substring(0);             // never used
        wet = true;
        return name;
    }
}
