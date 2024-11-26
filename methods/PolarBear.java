/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 232, 234
 * final and vararg example
 */
package methods;
public class PolarBear {
    final int age = 10;     // cannot be reassigned after initialization
    final int fishEaten;

    final String name;      // given a value in the default (no-argument) constructor

    { fishEaten=10; }

    public PolarBear() {
        name = "Robert";
    }

    public static void run(int... steps) {
        // any index higher than 1 will throw an ArrayIndexOutOfBoundsException, because the call from line 25 has only 2 parameters
        System.out.println(steps[1]);   // 77
    }

    public static void main(String[] args) {
        run(11, 77);
    }
}