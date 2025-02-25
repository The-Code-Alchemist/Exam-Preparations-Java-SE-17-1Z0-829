/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 372
 * A non-sealed interface can extend a sealed interface the same way class does.
 * However, the inheriting interface can only be sealed or non-sealed.
 * final is not allowed, because interfaces are implicitly absract - the exact opposite of final
 */
package beyond_classses.sealed_interfaces;
public non-sealed interface Floats extends Swims {}