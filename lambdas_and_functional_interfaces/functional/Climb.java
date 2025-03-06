/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 427
 * This is a functional interface, because it
 */
package lambdas_and_functional_interfaces.functional;
@FunctionalInterface
public interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}