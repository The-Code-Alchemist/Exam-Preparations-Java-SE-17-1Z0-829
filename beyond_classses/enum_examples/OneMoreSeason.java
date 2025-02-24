/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 363 - 364
 * Invalid case examples in enums
 */
package beyond_classses.enum_examples;
public enum OneMoreSeason {
    WINTER, SPRING, SUMMER, FALL;
    public static void main(String[] args) {
        OneMoreSeason summer = OneMoreSeason.SUMMER;
        var message = switch (summer) {
            case WINTER -> "Get out the sled!";
            // case OneMoreSeason.WINTER -> "Get out the sled!";    // Does not compile - unqualified case label needed, see previous line
            // case 0 -> "time for the pool";  // Does not compile - int values are not allowed
            default -> "Is it summer yet?";
        };
        System.out.println(message);
    }
}
