/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 164 - 165
 */
package coreAPIs;
public class EmptyAndBlankStrings {
    public static void main(String[] args) {
        // convenience methods for whether a String has a length of zero or contains only one whitespace character
        System.out.println(" ".isEmpty());  // false
        System.out.println("".isEmpty());   // true
        System.out.println(" ".isBlank());  // true, because it ONLY contains whitespace
        System.out.println("".isBlank());   // true, there are only whitespaces
    }
}
