/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 249
 * static final CONSTANT example
 */
public class ZooPen {
    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
//        NUM_BUCKETS = 5;                  // final variable cannot be rreassigned
        System.out.println(NUM_BUCKETS);    // they can be used though
    }
}
