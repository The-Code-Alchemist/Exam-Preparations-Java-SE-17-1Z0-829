/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 322 - 323
 * abstract methods cannot be private since they cannot be inherited by subclasses
 */
package class_design.zoo.whales;
public class HumpbackWhale extends Whale {
    // This overridden method cannot be package-private or private which would attempt to assign weaker access privileges
    @Override
    protected void sing() {

    }
}
