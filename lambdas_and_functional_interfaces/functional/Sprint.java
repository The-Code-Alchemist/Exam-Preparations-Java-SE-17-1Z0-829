/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 426
 * A functional interface such as this one has exactly one abstract method
 * The annotation on line 8 tells the compiler that you intend for the code to be a functional interface.
 */
package lambdas_and_functional_interfaces.functional;
@FunctionalInterface
public interface Sprint {
    public void sprint(int speed);
}