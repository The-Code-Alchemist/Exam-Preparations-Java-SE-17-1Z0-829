/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 348 - 349
 * This class implements the interface HasBigEyes, by extension the Nocturnal and CanFly interfaces
 */
package beyond_classses;
public class Owl implements HasBigEyes {

    @Override
    public int hunt() {
        return 5;
    }

    @Override
    public void flap() {
        System.out.println("Flap!");
    }


}
