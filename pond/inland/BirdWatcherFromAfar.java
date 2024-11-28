/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 239 - 242
 * This class is not allowed to access protected members of Bird
 * Subclasses and classes in the same package are the only ones allowed to access protected members
 */
package pond.inland;                        // Different package than pond.shore.Bird
import pond.shore.Bird;

public class BirdWatcherFromAfar {          // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();              // DOES NOT COMPILE
//        System.out.println(bird.text);    // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        new BirdWatcherFromAfar().watchBird();  // instantiates an empty Bird object
    }
}
