/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 251 - 252
 * static imports are for importing static members such as variables and methods which comes in handy when referring to
 * a lot of constants in another class e.g. java.lang.Math.E
 */
package methods;

import java.util.List;
import static java.util.Arrays.asList;  // only the static method asList is imported
// import static java.util.Arrays;      // will not compile - works only on the members of a class, not the class itself
// static import java.util.Arrays;      // import needs to be the first keyword
public class ZooParking {
    public static void main(String[] args) {
        List<String> list = asList("one","two");
        System.out.println(list);
        asList("one");  // anytime asList is referred to, the java.util.Arrays.asList method is called
//      Arrays.asList("one");   // will not compile - only the static method is imported, not the class
        System.out.println(Math.E);
    }
}
