/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 119, 120
 * switch case with arrow and yield
 */
package making_decisions;

public class SwitchCaseWithYieldExample {
    public static void main(String[] args) {
        fishTypes();
        canineTypes(5);
        getWeather(Season.FALL);
    }

    /**
     * The yield is equivalent to return statement within a switch expression and is used
     * to avoid ambiguity about whether you meant to exit the block or method around the switch expression
     * yield statements are not optional if the switch statement returns a value
     */
    public static void  fishTypes(){
        int fish = 2;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {yield "Trout";}
            case 3 -> {
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
        System.out.println(name);
    }

    /**
     * @param canis
     * All possible input values must be handled if the switch expression returns a value
     * either a yield or a default statement will do
     */
    public static void canineTypes(int canis) {
        String type = switch (canis) {
            case 1 -> "dog";
            case 2 -> "wolf";
            case 3 -> "coyote";
            case 4 -> "jackal";
            default -> throw new IllegalStateException("Unexpected value: " + canis);
        };
    }

    enum Season {WINTER, SPRING, SUMMER, FALL}

    public static String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL ->  "Warm";

            /**
             * default case is redundant here, all known values are covered already
             * Recommended to make your code more maintainable and robust
              */
            default -> "No idea which season it is!";
        };
    }
}
