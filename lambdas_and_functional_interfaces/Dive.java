/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 428
 * If the dive method is removed on line 12, remove the @FunctionalInterface annotation as well.
 * Or the code will no longer compile.
 */
package lambdas_and_functional_interfaces;
@FunctionalInterface
public interface Dive {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();     // Only this abstract method make this interface functional
}