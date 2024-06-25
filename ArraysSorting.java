import java.util.Arrays;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 183, 184
 */
public class ArraysSorting {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1 };
        // Numerical sorting
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }   System.out.println(numbers);

        String[] strings = {"10", "9", "100"};
        // Alphabetical sorting
        Arrays.sort(strings);
        for(String s: strings) {
            System.out.print(s +" ");
        }   System.out.println("");

        int[] moreNumbers = {2, 4, 6, 8};   // sorted array
        System.out.println(Arrays.binarySearch(moreNumbers, 2));
        System.out.println(Arrays.binarySearch(moreNumbers, 4));
        System.out.println(Arrays.binarySearch(moreNumbers, 1));
        System.out.println(Arrays.binarySearch(moreNumbers, 3));
        System.out.println(Arrays.binarySearch(moreNumbers, 9));

        int[] anotherNumberSet = new int[] {3, 2, 1}; // unsorted array
        System.out.println(Arrays.binarySearch(anotherNumberSet, 2));
        System.out.println(Arrays.binarySearch(anotherNumberSet, 3));
    }
}
