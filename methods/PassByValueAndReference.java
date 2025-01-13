/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 254
 *
 * Java is a "pass-by-value" language: A copy of a variable is made and the method receives that copy.
 * Assignments made in the method do not affect the caller. Primitives are always pass-by-value.
 *
 * "pass-by-reference"
 * Assignments made in the method do affect the caller.
 */
package methods;

public class PassByValueAndReference {
    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1);  // 1
        System.out.println(original2);  // 2
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
