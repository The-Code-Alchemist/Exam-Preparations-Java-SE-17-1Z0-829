/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 350 - 351
 * Inheriting Duplicate Abstract Methods
 *
 * Java supports inheriting two abstract methods that have compatible method declarations
 *
 * The abstract methods eatPlants() would no longer be compatible if the method signature in either interface changed
 * Incompatible method declarations would cause a compiler error in this class
 */
package beyond_classses;
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
