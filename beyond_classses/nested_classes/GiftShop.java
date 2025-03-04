/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 389 - 390
 * Anonymous classes must extend an existing class ot implement an existing Interface
 * on the spot where you use it.
 */
package beyond_classses.nested_classes;
public class GiftShop {
    interface SaleTodayOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
        // Anonymous class definition
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };  // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }
}
