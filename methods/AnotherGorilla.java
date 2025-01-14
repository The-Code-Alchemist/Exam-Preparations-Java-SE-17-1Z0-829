/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 257
 * The rest method needs a long parameter. Bot a long primitive and its object counterpart Long will do.
 * Java will not automatically cast a smaller integer type such as int to a larger type such as long AND autobox - line 15
 * Line 16 shows that a long wrapper can help pass a Long object into the rest method on line 10
 */
package methods;
public class AnotherGorilla {
    public void rest(Long x) {
        System.out.println("Long");
    }
    public static void main(String[] args) {
        var g = new AnotherGorilla();
//        g.rest(8);                  // will not compile, a long parameter needs to be passed on
        g.rest(Long.valueOf(8));
    }
}
