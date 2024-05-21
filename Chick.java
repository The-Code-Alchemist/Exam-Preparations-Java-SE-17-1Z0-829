public class Chick {
    private String name = "Fluffy";
    { System.out.println("setting field"); }
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

}
/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, pages 25 and 26
 * order of initialization
 */