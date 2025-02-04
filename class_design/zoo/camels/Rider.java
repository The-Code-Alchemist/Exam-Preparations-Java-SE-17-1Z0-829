/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 306 - 308
 * Overriding example with access modifiers
 *
 * Rider is included in this package to illustrate overriding
 */
package class_design.zoo.camels;
public class Rider {
    public static void main(String[] args) {
        // The reference type is of type Camel, but the object is actually an instance of type BactrianCamel
        Camel c = new BactrianCamel();
        System.out.println(c.getNumberOfHumps());   // 2 - overridden method in BactrianCamel used
    }
}
