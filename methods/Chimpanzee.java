/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 257
 * Java will automatically implicitly cast a smaller integer type such as int to a larger type such as long, as well as autobox.
 * However, it will not do both simultaneously. Line 16 shows that Java will not automatically cast to a narrower type.
 */
package methods;
public class Chimpanzee {
    public static void climb(long t) {}
    public static void swing(Integer u) {}
    public static void jump(int v) {}
    public static void main(String[] args) {
        var c =  new Chimpanzee();
        c.climb(123);   // int can be implicitly cast to a long
        c.swing(123);   // a primitive int is autoboxed to an Integer object
        c.jump((int)123L); // will not compile without explicit casting to an int - also an option in the method call
//        c.jump(123L); // will not compile without explicit casting to an int
    }
}
