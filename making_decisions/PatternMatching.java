/**
 * @author The Code Alchemist
 * Chapter 3: Making Decisions, page 106, 107
 */
package making_decisions;
public class PatternMatching {
    public static void main(String[] args) {
        Integer x = 5;
        compareIntegersWithoutPatternMatching(x);
        compareIntegersWithPatternMatching(x);
        printIntegerGreaterThan5(x);
    }

    /**
     * @param number
     */
    public static void compareIntegersWithoutPatternMatching(Number number) {
        if(number instanceof Integer) {
            Integer data = (Integer) number; // becomes redundant with pattern matching

            // method compareTo() defined in java.lang.Integer, but not in java.lang.Number
            System.out.println(data.compareTo(5));
        }
    }

    /**
     * @param number
     */
    public static void compareIntegersWithPatternMatching(Number number) {
        /**
         * By making the data parameter final, reassignment can be prevented
         * which is a bad practice with pattern matching
         */
        if(number instanceof final Integer data) {
            /**
             * Potential ClassCastException prevented thanks to pattern matching,
             * because casting to an Integer class is no longer required
             */

            // method compareTo() defined in java.lang.Integer
            System.out.println(data.compareTo(5));
        }
    }

    /**
     * Pattern matching includes expressions that can be used to filter data out, such as the next example
     * @param number
     */
    public static void printIntegerGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0)
            System.out.println(":" + data);
    }
}
