/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, page 178 - 182
 * All elements of an array are set to its default value such as int with a default value of 0
 */
package coreAPIs;

import java.util.Arrays;

public class MoreAboutArrays {
    public static void main(String[] args) {
        // Multiple String arrays of multiple dimensions can be defined in a single line as demonstrated
        String one[], two[][], three[][][];

        // You can comment out these methods to see what each of them does
        showAliasAndReference();
        castArray();
        showArrayLengthAndMembers();
        executeNumbersArray();
    }

    private static void showAliasAndReference() {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        for (int i = 0; i <= 2; i++) {
            System.out.print(bugs.equals(alias) + " "); // true
            System.out.print((bugs == alias) + " ");    // true
            System.out.print(bugs.toString() + " ");    // array reference shown starting wit [L
            System.out.println(alias.toString());       // array reference shown starting wit [L
        }
        System.out.println(Arrays.toString(bugs));      // Print an array clearly: [cricket, beetle, ladybug]
        System.out.println(Arrays.toString(alias));     // Print an array clearly: [cricket, beetle, ladybug]
    }

    private static void castArray() {
        // Arrays
        String[] strings = { "stringValue" };
        Object[] objects = strings;                     // No casting needed, Object is a broader type than String
        String[] againStrings = (String[]) objects;     // Casting required for more specific types
//      againStrings[0] = new StringBuilder();  // Will not compile as it is, String arrays only allow String objects
        againStrings[0] = String.valueOf(new StringBuilder());
        againStrings[0] = new String();
    }

    private static void showArrayLengthAndMembers() {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        var birds = new String[6];
        System.out.println(birds);          // reference to the String array birds
        System.out.println(birds.length);   // 6
    }

    private static void executeNumbersArray() {
        // the default value for the elements in this int array are set to 0
        int[] numbers = new int[3];
        int[] moreNumbers = new int[] {42, 55, 99};
        int[] evenMoreNumbers = {42, 55, 99};   // does exactly the same as the line above, essentially its shortcut
        for (int i = 0; i <= 2; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(moreNumbers[i]);
            System.out.println(evenMoreNumbers[i]);
        }
    }
}