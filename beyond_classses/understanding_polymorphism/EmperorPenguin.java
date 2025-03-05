/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 397 - 398
 * When you override a method, you replace all calls to it. Even those defined in the parent class.
 */
package beyond_classses.understanding_polymorphism;
class Penguin {
    public int getHeight() { return 3; }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}
public class EmperorPenguin extends Penguin {
    @Override
    public int getHeight() { return 8; }    // calls replaced at runtime

    public static void main(String[] fish) {
        new EmperorPenguin().printInfo();   // 8
        new Penguin().printInfo();          // 3
    }
}
