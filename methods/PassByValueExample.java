/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 253
 * Java is a "pass-by-value" language: A copy of a variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller.
 */
package methods;
public class PassByValueExample {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);             // 8 is shown
        System.out.println(num);    // 4 is shown, the value of num never got reassigned
    }

    private static void newNumber(int num) {
        num = 8;                    // Same name as on line 10, a coincidence. The exam may try to  distract you like this
        System.out.println(num);
    }
}