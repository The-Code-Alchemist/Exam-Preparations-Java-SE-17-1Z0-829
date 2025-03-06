/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 427
 * This is NOT a functional interface, because it has no abstract methods
 * Neither method meets the criteria to be abstract.
 * Method that are private or default are NEVER abstract!
 */
package lambdas_and_functional_interfaces.functional.sprinting_tiger;
public interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}