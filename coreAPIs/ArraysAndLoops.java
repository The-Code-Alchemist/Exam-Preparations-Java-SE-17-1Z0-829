/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, page 183 edge case
 */
package coreAPIs;
public class ArraysAndLoops {
    public static void main(String[] args) {
        showArrayNumbers();

        // these two are equivalent
        showMoreArrayNumbers();
        showArrayNumbersEnhancedForLoop();
    }

    private static void showArrayNumbers() {
        var numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {           // <= instead of < leads to an Exception, be careful on the exam
            // prints the index of this array increased by 5
            System.out.print((numbers[i] = i + 5) + " ");   // 5 6 7 8 9 10 11 12 13 14
        }
        System.out.println("");
    }

    private static void showMoreArrayNumbers() {
        var numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            // this one only prints 5
            System.out.print((numbers[i] += 5) + " ");      // 5 5 5 5 5 5 5 5 5 5
        }
        System.out.println("");
    }

    private static void showArrayNumbersEnhancedForLoop() {
        var numbers = new int[10];
        for(int i : numbers) {
            // this one only prints 5
            System.out.print((numbers[i] + 5) + " ");   // 5 5 5 5 5 5 5 5 5 5
        }
        System.out.println("");
    }
}
