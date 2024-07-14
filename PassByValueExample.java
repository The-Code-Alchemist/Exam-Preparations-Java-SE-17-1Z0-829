/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 253
 * pass-by-value example
 */
public class PassByValueExample {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);             // 8 is shown
        System.out.println(num);    // 4 is shown, the value of num never got reassigned
    }

    private static void newNumber(int num) {
        num = 8;
        System.out.println(num);
    }
}
