/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 427
 * This is NOT a functional interface, because it inherits the abstract method from its parent AND has one if its own.
 * Adding the @FunctionalInterface annotation would break this interface. This is a regular interface
 */
package lambdas_and_functional_interfaces.functional;

public interface Skip extends Sprint {
    void skip();
}