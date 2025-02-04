/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 306 - 308
 * Overriding example with access modifiers
 */
package class_design.zoo.camels;
public class BactrianCamel extends Camel {

    // This overridden method will not compile if its access modifier is more restrictive than its parent Camel
    int getNumberOfHumps() {
        return 2;
    }
}
