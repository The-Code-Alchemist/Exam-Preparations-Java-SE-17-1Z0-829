/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 132
 * A label is an optional pointer to the head of a statement thaat allows the application flow to jump to it
 * or break from it. Labels will not be on the exam, but let's have a look at them. we may need them on the job.
 */
package making_decisions;
public class Labels {
    public static void main(String[] args) {
        nestedLoopWithLabels();
        anotherLabelExample();
    }

    private static void nestedLoopWithLabels() {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7 , 12, 7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    private static void anotherLabelExample() {
        int frog = 15;
        BAD_IDEA: if (frog > 10)
            EVEN_WORSE_IDEA: {
                frog ++;
            }
    }
}
