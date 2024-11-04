/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 131
 * Neste loops are loops within loops which can have any combination of while, do/while, while and
 * for loops (both regular and for-each a.k.a. enhanced for loop)
 */
package making_decisions;
public class NestedLoops {
    public static void main(String[] args) {
        nestedLoopForAndForEach();
        nestedLoopWhileDoWhile();
    }

    private static void nestedLoopForAndForEach() {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7 , 12, 7}};
        for(int[] mySimpleArray : myComplexArray) {
            for(int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    private static void nestedLoopWhileDoWhile() {
        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", ");
        } // 3, 0
    }
}
