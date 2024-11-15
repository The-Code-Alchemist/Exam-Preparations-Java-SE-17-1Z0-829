/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 157-158
 * String Concatenation example to show the difference between
 * 1. If both operands are numeric, + means numeric addition
 * 2. If either operand is a String, + means concaten
 * 3. The expression is evaluated from left to right
 *
 * Strings are immutable, they cannot be changed.
 * Whenever a String variable concatenates multiple Strings, a new String is created.
 * The previous String still exists on the heap, and since there's no variable pointing to it,
 * this  String will be garbage colected.
 */
package coreAPIs;
public class StringConcatenationExamples {
    public static void main(String[] args) {
        System.out.println(1 + 2);              // 3        uses the first rule
        System.out.println("a" + "b");          // ab       uses the second rule
        System.out.println("a" + "b" + 3);      // ab3      uses the second and third rule
        System.out.println(1 + 2 + "c");        // 3c       uses the first and third rule for addition, concatenation comes next
        System.out.println("c" + 1 + 2);        // c12      uses the second and third rule
        System.out.println("c" + (1 + 2));      // c3       1 + 2 is calculated before concatenation
        System.out.println(("c" + null));       // cnull    null is treated as a String when concatenating, second and third rules

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);   // 1 + 2 + 3 = 6 which is concatenated with the String 4: 64

        // String s is compounded by concatenating "1", "2" and "3"
        var s = "1";    // String with value "1" created
        s += "2";       // new String with value "12" created
        s += 3;         // new String with value "123" created
        System.out.println(s);                  // 123
    }
}
