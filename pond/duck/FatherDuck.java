/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 235 - 242
 */
package pond.duck;
public class FatherDuck {
    String noise = "quack"; // cannot be used outside of this class with private access
    void quack() {  // cannot be called by other classes if private
        System.out.println(noise);  // private access is OK
    }
}
