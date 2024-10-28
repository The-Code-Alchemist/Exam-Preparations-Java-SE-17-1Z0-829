/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 113
 * break statement not required with the arrow operator
 */
package making_decisions;
public class MoreSwitchExamples {
    public static void main(String[] args) {
        season(17);

        whatKindOfBear(-1);
    }

    // cases combined for each season
    public static void season(int month) {
        var season = switch (month) {
            case 1, 2, 3 -> "Winter";
            case 4, 5, 6 -> "Spring";
            case 7, 8, 9 -> "Summer";
            case 10, 11, 12 -> "Fall";
            default -> "That's not a season: " + month;
        };
        System.out.println(season);
    }

    public static void whatKindOfBear(int bear) {
        var result = switch (bear) {
            case 1 -> "Grizzly";
            case 2 -> "Polar";
            case 3, 4 -> "Kodak";
            default -> "Panda";
        };
        System.out.println(result + " bear");
    }


}
