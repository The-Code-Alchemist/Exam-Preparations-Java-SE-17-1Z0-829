/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final array example
 */
import java.util.*;
public class ZooInventoryManager {
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
        treats[0] = "popcorn";
        System.out.println(treats[0]);
        treats[0] = "";     // contents can be reassigned, just don't point to adifferent object
        System.out.println(treats[0]);
    }
}
