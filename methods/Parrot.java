/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 259
 * Java picks the most specific version of a method that it can
 * Both String and StringBuilder implement CharSequence
 * Arrays.asList can be used to create a List<Integer> object
 */
package methods;

import java.time.*;
import java.util.*;

public class Parrot {
    public static void print(List<Integer> i) {
        System.out.print("I");
    }
    public static void print(CharSequence c) {
        System.out.print("C");
    }
    public static void print(Object o) {
        System.out.print("O");
    }
    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019, Month.JULY, 4));
    }
}
