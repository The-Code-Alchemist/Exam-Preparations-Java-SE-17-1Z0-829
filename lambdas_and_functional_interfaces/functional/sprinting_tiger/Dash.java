/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 427
 * This is a functional interface, because it inherits the only abstract method from its parent Sprint.
 * If it had its own method, the interface could no longer be functional.
 * Annotion added for additional clarity.
 */
package lambdas_and_functional_interfaces.functional.sprinting_tiger;
@FunctionalInterface
public interface Dash extends Sprint  {}
