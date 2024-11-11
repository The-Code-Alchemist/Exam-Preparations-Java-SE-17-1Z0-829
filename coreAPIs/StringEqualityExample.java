/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 162 - 163
 * Methods worth looking at in Java
 * equals(Object)
 * equalsIgnoreCase(String)
 * startsWith(prefix)
 * endsWith(suffix)
 * contains(CharSequence)
 * replace(oldString, newString), replace(oldChar, newChar)
 */
package coreAPIs;
public class StringEqualityExample {
    public static void main(String[] args) {

        // takes an Object as a parameter and does a character by character comparison
        System.out.println("abc".equals("ABC"));                        // false
        System.out.println("ABC".equals("ABC"));                        // true

        // separate Strings, but they have the same value
        String a = "A";
        a += "B";   // new String
        a += "C";   // new String
        System.out.println(a);

        String b =  "A";
        b += "B";   // new String
        b += "C";   // new String
        System.out.println(b);

        // falsetrue
        System.out.print(a == b);               // false, reference to different object despite identical contents
        System.out.println(a.equals(b));        // true, contents are compared, references do not matter here

        // takes a String as a parameterdoes a character by character comparison, but ignores its case
        System.out.println("abc".equalsIgnoreCase("ABC"));   // true

        // takes a String as a parameter
        System.out.println("abc".startsWith("a"));                      // true
        System.out.println("abc".startsWith("A"));                      // false - case does not match

        System.out.println("abc".endsWith("c"));                        // true
        System.out.println("abc".endsWith("a"));                        // false

        // takes a CharSequence as a parameter
        System.out.println("abc".contains("b"));                        // true
        System.out.println("abc".contains("B"));                        // false

        System.out.println("abcabc".replace('a', 'A'));                  // AbcAbc char can't be left blank
        System.out.println("abcabc".replace("a", "A"));                 // AbcAbc CharSequence CAN be left blank
        System.out.println("abcabc".replace("", "3"));                  // AbcAbc CharSequence CAN be left blank
        System.out.println("abcabc".replace("", "3").toUpperCase());    // AbcAbc CharSequence CAN ben left blank
    }
}
