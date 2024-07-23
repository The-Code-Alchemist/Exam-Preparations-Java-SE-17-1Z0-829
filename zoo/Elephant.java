/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 295
 * constructors - calling super
 */
package zoo;
public class Elephant extends Mammal {
    public Elephant() {
        // explicit call to the parent constructor
        // this call will not compile without the age parameter
        super(4);
    }
}
