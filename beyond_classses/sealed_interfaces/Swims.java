/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 372
 * An interface can be sealed the same way class is.
 */
package beyond_classses.sealed_interfaces;
public sealed interface Swims permits Duck, Swan, Floats {}