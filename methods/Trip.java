/**
 * @author The Code Alchemist
 * Chapters 5: Methods, page 227
 * Demonstrating some valid and invalid method signatures.
 *
 * A method's signature consists of the method name and parameter list to uniquely determine exactly which method
 * you are trying to call.
 * Once it determines which method you are trying to call, it then determines if the call is allowed
 *
 * Invalid method signatures have been commented out with explanations at the end of the line
 */
package methods;
public class Trip {
    public void visitZoo(String name, int waitTime) {}

    // Will not compile, because it has the same signature as the previous method. Parameter names do not matter
//    public void visitZoo(String attraction, int rainFall) {}

    public void visitZoo(int rainFall, String attraction) {}    // Different method signature, their order has changed
}
