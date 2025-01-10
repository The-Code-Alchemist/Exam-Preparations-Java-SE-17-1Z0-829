/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final array example
 */
package methods;
import java.util.*;
public class ZooInventoryManager {
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
        treats[0] = "popcorn";
        System.out.println(treats[0]);
        treats[0] = "!";                    // Contents can be reassigned, just don't point to a different object
        treats[1] = (String) new Object();  // Reference to a different kind of object will cause a ClassCastException
        System.out.println(treats[0]);
        System.out.println(treats[1]);
    }
}