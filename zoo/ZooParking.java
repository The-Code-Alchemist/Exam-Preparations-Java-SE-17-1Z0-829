/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 251
 * static import example
 */
package zoo;
import java.util.List;
// import static java.util.Arrays;      // will not compile - works only on the members of a class, not the class itself
import static java.util.Arrays.asList;  // only the static method asList is imported
// static import java.util.Arrays;      // import needs to be the first keyword
public class ZooParking {
    public static void main(String[] args) {
        List<String> list = asList("one","two");
        System.out.println(list);
        asList("one");
//      Arrays.asList("one");   // will not compile - only the static method is imported, not the class
    }
}
