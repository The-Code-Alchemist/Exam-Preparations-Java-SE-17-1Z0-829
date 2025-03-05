/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 399 - 400
 * The getHeight() method is hidden, not overridden
 */
package beyond_classses.understanding_polymorphism;

class AnotherPenguin {
    public static int getHeight() { return 3; }
    public void printInfo() {
        System.out.println(this.getHeight());
    }
}

public class CrestedPenguin extends AnotherPenguin {
    public static int getHeight() { return 8; }     // Hidden, not overridden
    public static void main(String[] args) {
        new CrestedPenguin().printInfo();
    }
}
