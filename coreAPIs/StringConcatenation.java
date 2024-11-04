/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages 157-158
 * String Concatenation example to show the difference between
 * 1. If both operands are numeric, + means numeric addition
 * 2. If either operand is a String, + means concaten
 * 3. The expression is evaluated from left to right
 */
package coreAPIs;
public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println(1 + 2);              // 3        uses the first rule
        System.out.println("a" + "b");          // ab       uses the second rule
        System.out.println("a" + "b" + 3);      // ab3      uses the second and third rule
        System.out.println(1 + 2 + "c");        // 3c       uses the first and third rule for addition, concatenation comes next
        System.out.println("c" + 1 + 2);        // c12      uses the second and third rule
        System.out.println(("c" + null));       // cnull    null is treated as a String when concatenating, second and third rules

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);   // 1 + 2 + 3 = 6 which is concatenated with the String 4: 64
    }
}
