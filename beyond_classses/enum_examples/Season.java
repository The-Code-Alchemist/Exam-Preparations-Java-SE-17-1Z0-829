/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 361 - 362
 * Enums are used for a finite set of values whose types are known at compile time
 *
 * enum values are comma separated with an optional semicolon ; at the end for simple enums
 * A simple enum is one that only contains a list of values
 */
package beyond_classses.enum_examples;
public enum Season {
    WINTER, SPRING, SUMMER, FALL;               // semicolon optional at the end of a simple enum

    public static void main(String[] args) {
        var s = SUMMER;
        System.out.println(s);                  // SUMMER
        System.out.println(s == SUMMER);        // true
        System.out.println(s.equals(SUMMER));   // true

        for (var season:Season.values()) {
            // prints the value of each season and their corresponding int value
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
}
