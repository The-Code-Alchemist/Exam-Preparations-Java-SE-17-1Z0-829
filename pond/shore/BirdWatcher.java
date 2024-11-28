/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 239 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 */
package pond.shore;         // same package as Bird
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();            // floating - protected access is OK
        System.out.println(bird.text);  // floating - protected access is OK
    }

    public static void main(String[] args) {
        new BirdWatcher().watchBird();
    }
}
