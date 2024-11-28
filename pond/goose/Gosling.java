/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 238 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 */
package pond.goose;                     // Different package than
import pond.shore.Bird;
public class Gosling extends Bird {     // Gosling is a subclass of bird, in a different package
    public void swim() {
        floatInWater();                 // floating - protected access is OK
        System.out.println(text);       // floating - also from pond.shore.Bird
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
