/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 236 - 242
 * No acces modifier means package access, which means any class in the same package can access this class's fields
 */
package pond.duck;
public class MotherDuck {
    String noise = "quack";         // any class in the same package can access this field
    void quack() {
        System.out.println(noise);  // package access is OK
    }
}
