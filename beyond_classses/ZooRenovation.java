/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 359
 * Calling abstract methods: default methods can call abstract methods
 *
 * The methods projectName() and status() have the same public abstract modifiers implicitly.
 * Both of them are public an abstract, but each of the methods has only one explicit modifier.
 */
package beyond_classses;
public interface ZooRenovation {
    public String projectName();
    abstract String status();
    default void printStatus() {
        System.out.println("The " + projectName() + " project " + status());
    }
}
