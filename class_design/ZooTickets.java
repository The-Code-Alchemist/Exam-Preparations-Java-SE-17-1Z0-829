/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 301
 * Initalizing instance examples
 *
 * Initialize the class. Superclass is Object, since ZooTickets does not have an explicit superclass
 * 1. Static int COUNT and the static initializers are assigned     0-10-
 * 2. Instance initializer executed                                 BestZoo-
 * 3. Constructor creates a ZooTickets object printing out          z-
 */
package class_design;
public class ZooTickets {
    private String name = "BestZoo";
    { System.out.print(name + "-"); }                       // BestZoo-
    private static int COUNT = 0;
    static  { System.out.print(COUNT + "-"); }
    static  { COUNT += 10; System.out.print(COUNT + "-");}  // 0-10-

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String... patrons) {
        new ZooTickets();
    }
}
