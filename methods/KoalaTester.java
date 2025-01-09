/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 244
 *
 * methods.Koala.main(String[] args) is called from this class
 * Basically a static main method calling another static main method
 * N.B. a static method cannot call instance methods, this will lead to a compiler error
 */
package methods;
public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);  // call static method
    }
}
