/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 363 - 364
 *
 * Enums can be used with switch statements. Both the regular and the arrow notation versions support enums.
 * The arrow notation version is used here instead of the regular switch statement
 */
package beyond_classses.enum_examples;
public enum AnotherSeason {
    WINTER, SPRING, SUMMER, FALL;
    public static void main(String[] args) {
        var summer = SUMMER;
        switch (summer) {
            case WINTER -> System.out.println("Get out the sled!");
            case SUMMER -> System.out.println("Time for the pool!");
            // case AnotherSeason.SPRING -> "Never mind SPRING season, this will not compile";
            default -> System.out.println("Is it summer yet?");
        }
    }
}