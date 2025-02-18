/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 322 - 323
 * abstract methods cannot be private, since they cannot be inherited by subclasses
 */
package class_design.zoo.whales;
public abstract class Whale {
    protected abstract void sing();     // This method will not compile if it is private, since it is not inherited
}
