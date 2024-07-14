/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 261
 * overloading reference types
 */
package zoo;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

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
        print(Arrays.asList(3));    // Arrays.asList(3) can be used to create a List<Integer> object
        print(LocalDate.of(2019, Month.JULY, 4));
    }
}
