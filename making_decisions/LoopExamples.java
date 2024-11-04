/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 124, 125, 126, 127, 128, 129
 * loop examples: for and for-each loops
 */
package making_decisions;
public class LoopExamples {
    public static void main(String[] args) {
        eatingMuchMore();
    }

    int i, j;
    public static void eatingMuchMore() {

        // for loop with multiple initializations, combined boolean condition and multiple
        for(int i = 0, j = 9, k = 1,  l = 5; i < 10 && j > 0; ++i, --j, k *= 2, l++) {
            System.out.println(i + " " + j + " " + k + " " + l);
        }

        System.out.println("");

        for(var k = 5; k > 0; k--) {
            System.out.print(k + " ");
        }

        int[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum  = 0;
        for(long current : count) {
            sum += current;
            System.out.print(" " + sum + " ");
        }
        System.out.println(sum); // only print the last value of sum
    }
}