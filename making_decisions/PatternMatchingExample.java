/**
 * @author The Code Alchemist
 * Chapter 3: Making Decisions, page 106, 107, 108, 109, 110
 */
package making_decisions;
public class PatternMatchingExample {
    public static void main(String[] args) {
        Integer x = 5;

        compareIntegersWithoutPatternMatching(x);
        printIntegerOrNumberGreaterThan5(x);
        compareIntegersWithPatternMatching(x);
        printIntegerTwice(x);
        printOnlyIntegers(x);
        printOnlyIntegersRefactored(x);
    }

    /**
     * @param number
     */
    private static void compareIntegersWithoutPatternMatching(Number number) {
        if(number instanceof Integer) {
            Integer data = (Integer) number; // becomes redundant with pattern matching

            /**
             * Number type cast to Integer, because method compareTo() is defined on java.lang.Integer
             * but not on java.lang.Number
             */
            System.out.println(data.compareTo(5));
        }
    }

    /**
     * @param number
     * A code of avriable type is checked whether it is of a particular type and then immediately cast into that type.
     */
    private static void compareIntegersWithPatternMatching(Number number) {
        /**
         * By making the data parameter final, reassignment can be prevented
         * which is a bad practice with pattern matching
         */
        if(number instanceof final Integer data) {
            /**
             * Potential ClassCastException prevented thanks to pattern matching,
             * because casting to an Integer class is no longer required
             */

            // method compareTo() defined in java.lang.Integer, but not in java.lang.Number
            System.out.println(data.compareTo(5));
        }
    }

    /**
     * Flow Scoping: the variable is only in scope if the compiler can definitely determine its type at compile-time.
     *
     * Pattern matching includes expressions that can be used to filter data out, such as the next example
     * so that the if statement can be executed only in specific circumstances.
     *
     * If the && were to replaced by ||, this method would not compile.
     * If the input would not inherit Integer, the data (pattern) variable would be undefined.
     * The compiler cannot guarantee that data is an instance of java.lang.Integer
     * @param number
     */
    private static void printIntegerOrNumberGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0)
            System.out.println(":" + data);
    }

    /**
     * Variable data out of scope after if statement
     * @param number
     */
    private static void printIntegerTwice(Number number) {
        if(number instanceof Integer data)
            System.out.println(data.intValue());
//        System.out.println(data.intValue());  // out of scope
    }

    /**
     * This method returns if the input does NOT inherit java.lang.Integer
     * Therefore, data stays in scope, even after the if statement ends
     * @param number
     */
    private static void printOnlyIntegers(Number number) {
        if(!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

    /**
     * This method inverts the if and else branches of the previous methods by inverting the boolean expression
     * @param number
     */
    private static void printOnlyIntegersRefactored(Number number) {
        if(number instanceof Integer data)
            System.out.println(data.intValue());
        else
            return;
    }
}
