/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 238 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 */
package pond.shore;
public class Bird {
    protected String text = "floating"; // any  class that extend this one, can access this field
    protected void floatInWater() {
        System.out.println(text);       // protected access is OK
    }
}
