/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 255
 * Autoboxing and unboxing example
 */
package zoo;
public class Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}

    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
        c.jump(123);
//        c.jump(123l);   // long parameter must be explicitly cast into an int, or the code will not compile
    }

}
