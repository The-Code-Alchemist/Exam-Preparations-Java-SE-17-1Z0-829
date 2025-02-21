/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 354 - 355
 * default method example
 */
package beyond_classses;
public interface IsColdBlooded {
    boolean hasScales();
    default double getTemperatures() {
        return 10.0;
    }
}
