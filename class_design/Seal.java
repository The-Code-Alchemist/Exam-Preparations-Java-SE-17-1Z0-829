/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 295 - 296
 * Constructor with an int parameter
 *
 * Since this class has an explicit constructor with an int parameter,
 * it no longer has a default constructor generated at compile-time
 */
package class_design;
public class Seal extends Mammal{
    public Seal() {
        // explicit call to the parent constructor
        // this call will not compile without the age parameter
        super(6);
    }
}
