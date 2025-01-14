/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 256 - 257
 * Autoboxing and Unboxing is straightforward usually, but there are some pitfalls
 * Java will automatically implicitly cast a smaller integer type such as int to a larger type such as long, as well as autobox.
 * However, it will not do both simultaneously. Line 12 shows this.
 */
package methods;
public class AutoboxingPitfalls {
    public static void main(String[] args) {
//        Long badGorilla = 8;            // Will not compile, a primitive int will not be cast into long AND be autoboxed at the same time
        Long goodGorilla = 7L;

        Character elephant = null;      // Compiles, but throws a NullPointerException at runtime
        char badElephant = elephant;
        System.out.println(badElephant);

    }
}
