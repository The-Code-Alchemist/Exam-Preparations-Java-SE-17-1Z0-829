/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 428
 * Not a functional interface, there are two abstract methods failing the SAM (Single Abstract Method) test:
 * equals on line 10 and rest on line 12
 */
package lambdas_and_functional_interfaces;
public interface Hibernate {
    String toString();
    public boolean equals(Hibernate o); // Since Hibernate is passed instead of Object, this method counts for the SAM test
    public abstract int hashCode();
    public void rest(); // Which makes this method the second abstract method
}