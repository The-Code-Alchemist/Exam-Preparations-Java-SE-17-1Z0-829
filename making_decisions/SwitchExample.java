/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 116, 117, 119
 * A break statement is not required since Java 14. Have a look at code examples.
 * A default statement is required to cover all possible values.
 */
package making_decisions;
public class SwitchExample {
    public static void main(String[] args) {
        String name = """
                Fluffy""";
        System.out.println(name);

        printDayOfTheWeekWithoutSwitch(7);

        printDayOfTheWeek(8);

        whatKindOfBear(-1);

        season(17);

        fishTypes();
    }

    // not recommended in practice, a switch is preferred for a long list of options
    public static void printDayOfTheWeekWithoutSwitch(int day) {
        if(day == 0) {

        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else if(day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("No ide what day it is!");
        }
    }

    // break statement not required with the arrow operator
    public static void printDayOfTheWeek(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "What day is it? I can't tell";
        };
        System.out.println(result);
    }

    // break statement not required with the arrow operator
    public static void whatKindOfBear(int bear) {
        var result = switch (bear) {
            case 1 -> "Grizzly";
            case 2 -> "Polar";
            default -> "Panda";
        };
        System.out.println(result + " bear");
    }

    // break statement not required with the arrow operator
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

    public static void  fishTypes(){
        int fish = 5;
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
}