/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, pages 235 - 242
 * private fields can only be accessed in the same class
 */
package pond.duck;
public class FatherDuck {
    private String noise = "quack";     // cannot be used outside of this class with private access
    private void quack() {  // cannot be called by other classes if private
        System.out.println(noise);      // private access is OK
    }
}
