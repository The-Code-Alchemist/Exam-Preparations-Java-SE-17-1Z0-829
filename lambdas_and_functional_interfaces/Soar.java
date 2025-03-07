/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 428
 * Not a functional interface, it is a public method in the java.lang.Object class
 */
package lambdas_and_functional_interfaces;
public interface Soar {
    abstract String toString();
    // abstract int someThing();     // uncomment this line, and we have a functional interface
}