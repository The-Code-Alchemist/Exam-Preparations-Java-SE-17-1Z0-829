public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;
    { number = 4; }}
/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, page 26
 * order of initialization
 */
