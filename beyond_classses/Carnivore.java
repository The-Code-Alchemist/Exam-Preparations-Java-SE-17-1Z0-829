/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 355
 * default methods: don't mix up concrete and abstract methods
 */
package beyond_classses;
public interface Carnivore {
    public default void eatMeat() {};   // A default method will not compile without method body
    public int getRequiredFoodAmount(); // A public abstract method is not allowed to have a body, see lines 11 - 13

//    public int getRequiredFoodAmount() {
//        return 13;
//    }

}
