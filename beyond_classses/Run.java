/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 356 - 357
 * default method example
 */
package beyond_classses;
public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
