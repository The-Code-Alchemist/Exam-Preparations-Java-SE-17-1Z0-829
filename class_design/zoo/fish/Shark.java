/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 310
 * Override with the @Override annotation
 */
package class_design.zoo.fish;
public class Shark extends Fish {

    // Tell the compiler you are trying to override the method of a parent class
    @Override
    public void swim() {};
    // Be sure to match the exact same method signature.
    // Passing an argument only here would cause a compiler error
    // as the overridden method would no longer match the method signature of its parent class Fish
}
