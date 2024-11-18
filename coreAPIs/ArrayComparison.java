/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, pages 185 - 187
 *
 * The compare() method allows two arrays to be compared
 * A negative number means the first array is smaller than the second
 * a zero means the arrays are equal
 * A positive number means the first array is larger than the second
 *
 * The mismatch() method allows two arrays to be compared
 * If the arrays are equal, a negative number is returned
 *
 */
package coreAPIs;

import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));               // -1
        System.out.println(Arrays.compare(new int[] {2}, new int[] {2}));               // 0, the arrays are equal
        System.out.println(Arrays.compare(new int[] {3}, new int[] {2}));               // 1
        System.out.println(Arrays.compare(new String [] {"a"}, new String[] {"aa"}));   // -1
        System.out.println(Arrays.compare(new String [] {"a"}, new String[] {"A"}));    // 32
        System.out.println(Arrays.compare(new String [] {"a"}, new String[] {null}));   // 1
//        System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"}));        // will not compile, different types

        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));              // -1
        System.out.println(Arrays.mismatch(new String [] {"a"}, new String [] {"A"}));  // 0
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1, 2}));           // 1
    }
}
