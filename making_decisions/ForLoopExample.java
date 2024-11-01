/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 125-127
 * for loop example
 * In addition to the boolean expression and statements as its while and do/while counterparts,
 * for loops have an initialization block and an update statement.
 */
package making_decisions;
public class ForLoopExample {
    public static void main(String[] args) {
        // comment out to selectively see their out
        executeForLoopWithCodeBlock();
        executeForLoopWithoutCodeBlock();
        executeForLoopWithoutCodeBlockWithinScope();
        printFiveNumbersConsequtively();
        printFiveNumbersConsequtivelyReverse();
        printFiveNumbersConsequtivelyReverseImproved();
    }

    /**
     * The order in which the for loop is executed
     * 1. The initialization is executed first: int i = 0;
     * 2. The boolean condition is evaluated next
     *      N.B. The for loop is skipped entirely as soon as its boolean condition evaluates to false.
     *      Caution: if there is no boolean condition at all, the for loop will go on forever!
     * 3. The body of the for loop is executed.
     *      N.B. This loop's body is in a code block.
     * 4. The update statement i++ is executed
     * 5. The for loop returns to step 2. as long as it evaluates to true
     * Variables declared in the for loop are limited to the code block of the for loop
     */
    private static void executeForLoopWithCodeBlock() {
        for(int i = 0; i < 10; i++) {
            // values are printed twice after one another with a space in between, possible because of a code block
            System.out.println("Value is: " + i);
            System.out.println(" " + i);
        }
    }

    /**
     * Similar to the previous method, however only the first System.out.print(i + " "); will be executed.
     * The second (line 39) is out of scope and will not even compile.
     */
    private static void executeForLoopWithoutCodeBlock() {
        for(int i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
//        System.out.println(" " + i);    // Uncomment this line and the code will no longer compile
    }

    /**
     * Similar to the previous method, both lines with System.out.print(i + " "); will be executed.
     * The second (line 53) is now within scope, because it was declared outside of the for loop (line 50).
     */
    private static void executeForLoopWithoutCodeBlockWithinScope() {
        int i;
        for(i = 0; i < 10; i++)
            System.out.println(i + " ");
        // although the for loop terminates, i still get incremented to 10
        System.out.println(i + " within scope of the method");
    }

    private static void printFiveNumbersConsequtively() {
        for(int i = 0; i < 5 ; i++) {
            System.out.print(i + " "); // 0 1 2 3 4
        }   System.out.println("");
    }

    // var is allowed in for loops, but the previous method's output is not reversed correctly
    private static void printFiveNumbersConsequtivelyReverse() {
        for(var i = 5; i > 0 ; i--) {
            System.out.print(i + " "); // 5 4 3 2 1
        }   System.out.println("");
    }

    // The order is correctly reversed to: 4 3 2 1 0
    private static void printFiveNumbersConsequtivelyReverseImproved() {
        for(var i = 4; i >= 0 ; i--) {
            System.out.print(i + " "); // 4 3 2 1 0
        }   System.out.println("");
    }
}
