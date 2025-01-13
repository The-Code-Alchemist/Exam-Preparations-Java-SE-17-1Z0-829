/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 251
 * static imports are for importing static members such as variables and methods which comes in handy when referring to
 * a lot of constants in another class e.g. java.lang.Math.PI
 */
package methods;

import java.util.List;
import java.util.Arrays;

public class Imports {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one","two");
        System.out.println(list);
        System.out.println(Math.PI);
    }
}
