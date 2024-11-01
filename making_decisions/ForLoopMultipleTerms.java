/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 127-128
 * for loop example with multiple terms
 * Similar to the for loop, but more than one variable is in it
 * The terms present in the for loop are not required to be used, such as long variable z on line 16
 */
package making_decisions;
public class ForLoopMultipleTerms {
    public static void main(String[] args) {
        multipleTerms();
    }

    private static void multipleTerms() {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
            System.out.print(x + " ");
        }
    }
}
