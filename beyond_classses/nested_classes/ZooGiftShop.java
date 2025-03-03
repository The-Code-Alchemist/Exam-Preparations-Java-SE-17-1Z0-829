/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 389
 * Anonymous classes must extend an existing class ot implement an existing Interface
 * In this example, the anonymous class is equivalent to writing a local class with an unspecified name
 * that extend SaleTodayOnly and immediately uses it
 */
package beyond_classses.nested_classes;
public class ZooGiftShop {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        // Anonymous class definition, method body provided anonymously
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };  // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }
}
