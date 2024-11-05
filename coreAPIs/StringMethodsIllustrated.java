/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 157-161
 * Let's try out some java.lang.String methods
 * public int length()
 * public char charAt(int index)
 * indexOf(int ch, int fromIndex), indexOf(int ch)
 * substring(beginIndex, endIndex)
 * toUpperCase()
 * toLowerCase()
 */
package coreAPIs;
public class StringMethodsIllustrated {
    public static void main(String[] args) {

        // all methods in this class use this global variable which is inferred as a String
        var name = "animals";

        // Comment out these methods as you like to see their output separately
        showStringLength(name);
        showCharacterIndex(name);
        showIndexOfStringsAndCharacters(name);
        showSubstring(name);

        adjustCase();
    }

    private static void showStringLength(String name) {
        // length of a String is shown as an int
        // query the String to find out what character is at a specific index
        System.out.println(name.length());              // shows the length of a String where an int is returned: 7

        // promoted to long
        System.out.println(name.length() + 2l);         // arithmetic can be performed on the returned int: 7 + 2 = 9
    }

    private static void showCharacterIndex(String name) {
        // returns the characters in the index
        System.out.println(name.charAt(0));             // first character of the variable name is shown
        System.out.println(name.charAt(6));             // second character of the variable name is shown
//        System.out.println(name.charAt(7));           // eighth character causes a StringIndexOutOfBoundsException also terminates the program
//        System.out.println(name.charAt(-1));          // invalid character index also  causes a StringIndexOutOfBoundsException also terminates the program
    }

    /**
     * Look at the characters in the String and find the first index that matches the desired value.
     * The indexOf methods can work with an entire String or any single character as an input
     * It can also start from a requested position. A char can be passed to an int parameter type
     * @param name
     */
    private static void showIndexOfStringsAndCharacters(String name) {
        /**

         */
        System.out.println(name.indexOf('a'));                   // 0
        System.out.println(name.indexOf("al"));                  // 4
        System.out.println(name.indexOf('a', 4));   // 4
        System.out.println(name.indexOf("al", 5));  // -1, caller knows -1 is an invalid index, arrays are 0-based
    }

    /**
     * A substring looks for characters in a String to return part of that String
     * based on the String's beginIndex and an optional endIndex
     * @param name
     */
    private static void showSubstring(String name) {
        System.out.println(name.substring(3));         // mals
        System.out.println(name.substring(name.indexOf('m')));  // mals
        System.out.println(name.substring(3, 4));               // m, stops at the 5th character which is NOT included
        System.out.println(name.substring(3, 7));               // mals, stops at the 8th character - which is OUT OF BOUNDS

        System.out.println(name.substring(3, 3));               // empty substring
//        System.out.println(name.substring(3, 2));             // java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 7       also terminates the program
//        System.out.println(name.substring(3, 8));             // S // java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7       also terminates the program
    }

    private static void adjustCase() {
        System.out.println("animals".toUpperCase());    // ANIMALS
        System.out.println("ABC123".toLowerCase());     // abc123
    }
}
