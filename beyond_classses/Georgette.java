/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 353
 * Weaker access privileges cannot be assigned to an overridden method imlementing an interface, see line 10
 */
package beyond_classses;
public class Georgette implements Poodle {
    // The play method needs to be public, because it's implicitly public in the interface Poodle. Watch for that rule!
    @Override
    public void play() {}
}
