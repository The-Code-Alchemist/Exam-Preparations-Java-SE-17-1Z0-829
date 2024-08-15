/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, pages 11 - 13
 * This class will NOT compile without the import on line 3
 *
 * Everything within the java.lang package is imported automatically
 * The System class is imported explicitly on line 18
 */
package introduction;

import java.util.Random;
import java.lang.*;

public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        java.lang.System.out.println(r.nextInt(10));
    }
}
