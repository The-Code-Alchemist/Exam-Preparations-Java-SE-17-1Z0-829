/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, pages 23, 25 and 26
 * order of initialization
 */
package zoo;
public class Chick {
    private String name = "Fluffy";
    { System.out.println("setting field"); } // initialization block executed before constructor
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}