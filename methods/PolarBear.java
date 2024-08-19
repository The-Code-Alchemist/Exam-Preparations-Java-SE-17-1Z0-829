/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 232, 234
 * final and vararg example
 */
package methods;
public class PolarBear {
    final int age = 10;
    final int fishEaten;

    final String name;

    { fishEaten=10; }

    public PolarBear() {
        name = "Robert";
    }

    public static void run(int... steps) {
        // any index higher than 1 will throw an ArrayIndexOutOfBoundsException
        System.out.println(steps[1]);   // 77
    }

    public static void main(String[] args) {
        run(11, 77);
    }
}