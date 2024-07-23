/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 298, 299
 * Initializing final Fields
 */
package zoo;
public class MouseHouse {
    private final int volume;
    private final String name;
    public MouseHouse() {
        this.name = "Empty Mouse";  // Constructor assignment
    }
    {
        volume = 10;                // Instance initializer assignment
    }
}
