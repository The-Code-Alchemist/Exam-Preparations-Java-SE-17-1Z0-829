/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, pages 420 - 422
 * This interface has one abstract method. Annotation added for clarification
 */
package lambdas_and_functional_interfaces;
@FunctionalInterface
public interface CheckTrait {
    boolean test(Animal a);
}