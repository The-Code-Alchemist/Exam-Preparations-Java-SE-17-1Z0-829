/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final CONSTANT example
 * final variables cannot ber reassigned, regardless of instance or static types
 */
package methods;
public class ZooPen {
    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
//        NUM_BUCKETS = 5;                  // final variable cannot be reassigned
        System.out.println(NUM_BUCKETS);    // they can be used though
    }
}