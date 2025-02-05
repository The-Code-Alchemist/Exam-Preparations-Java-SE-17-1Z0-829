/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 302 - 303
 * constructor calls and order of initialization
 *
 * 1. Static variables and initializers are processed first     0
 * 2. main method comes after that                              Ready
 * 3. Instance variables and initializers are processed         Swimmy
 *                                                              1
 * 4. Constructor creates a CuttleFish object, printing         Constructor
 */
package class_design.zoo.fish;
public class CuttleFish {
    private static String name = "swimmy";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    { COUNT++; System.out.println(COUNT); }

    public CuttleFish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new CuttleFish();
    }

}
