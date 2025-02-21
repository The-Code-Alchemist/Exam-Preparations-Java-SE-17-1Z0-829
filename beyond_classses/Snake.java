/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 354 - 355
 * default method example
 * Overriding the getTemperatures() method is optional
 */
package beyond_classses;
public class Snake implements IsColdBlooded{
    @Override
    public boolean hasScales() {
        return true;
    }

    // Overriding this method is optional, because it already has a default implementation
    @Override
    public double getTemperatures() {
        return 12;
    }
}
