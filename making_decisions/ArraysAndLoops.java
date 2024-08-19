package making_decisions;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, page 183 edge case
 */
public class ArraysAndLoops {
    public static void main(String[] args) {
        var numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            // prints the index of this array increased by 5
            System.out.print(numbers[i] = i + 5);
        }   System.out.println("");

        var moreNumbers = new int[10];
        for(int j = 0; j < moreNumbers.length; j++) {
            // this one only prints 5
            System.out.print(moreNumbers[j] += 5);
        }
    }
}
