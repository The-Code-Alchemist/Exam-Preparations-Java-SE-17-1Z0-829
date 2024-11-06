/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 164 - 165
 */
package coreAPIs;
public class StringWhitespaceRemoval {
    public static void main(String[] args) {
        char character = '\u2000';      // space                // beyond the scope of this exam
        System.out.println(character);

        // Let's look at some java.lang.String methods
        System.out.println("abc".strip());                      // abc
        // \t is a single character
        System.out.println("\t  a b c\n".strip());              // a b c

        String text = " abc\t ";                                // \t is a single character
        System.out.println(text.trim().length());               // 3

        // the strip() method does everything the trim() method does, but it supports unicode
        System.out.println(text.strip().length());              // 3

        // removes whitespace from the beginning of the String, leaves the whitespace at the end
        System.out.println(text.stripLeading().length());       // 5

        // removes whitespace from the end of the String, leaves the whitespace at the beginning
        System.out.println(text.stripTrailing().length());      // 4
    }
}
