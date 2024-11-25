/**
 * @author The Code Alchemist
 * Chapters 5: Methods, page 228
 */
package methods;
public class Bird {
    public void fly1() {}       // Valid method declaration without parameters

    /**
     * This method will not compile without body which is without curly braces {}
     * The next line would work in an abstract class, though
     * public abstract void fly2();
     */
//    public void fly2()
    public void fly3(int a) {}  // Valid method declaration with one int parameter
}
