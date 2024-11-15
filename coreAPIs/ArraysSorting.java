/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 183 - 185
 */
package coreAPIs;
import java.util.Arrays;    // import java.util.*;  // works as well
public class ArraysSorting {
    public static void main(String[] args) {

        // You can comment out these methods to see what each of them does
        sortNumerically();
        sortAlphabetically();
        searchBinarySortedArray();
        searchBinaryUnsortedArray();
    }

    private static void sortNumerically() {
        int[] numbers = {6, 9, 1 };
        // Numerical sorting
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // 1 6 9
        }   System.out.println(numbers);
    }

    private static void sortAlphabetically() {
        String[] strings = {"10", "9", "100"};
        // Alphabetical sorting
        Arrays.sort(strings);
        for(String s: strings) {
            System.out.print(s +" ");           // 10 100 9
        }   System.out.println(strings + " ");
    }

    private static void searchBinarySortedArray() {
        int[] numbers = {2, 4, 6, 8};   // sorted array
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));
    }

    private static void searchBinaryUnsortedArray() {
        int[] numbers = new int[] {3, 2, 1}; // unsorted array
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}