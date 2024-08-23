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
    }

    public static void compareIntegersWithoutPatternMatching(Number number) {
        if(number instanceof Integer) {
            Integer data = (Integer) number; // becomes redundant with pattern matching

            // method compareTo() defined in java.lang.Integer, but not in java.lang.Number
            System.out.println(data.compareTo(5));
        }
    }

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
}
