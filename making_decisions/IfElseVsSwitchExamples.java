/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 110, 111,  112, 113, 116, 117, 119
 * A break statement is not required since Java 14. Have a look at code examples.
 * A default statement is required to cover all possible values.
 */
package making_decisions;
public class IfElseVsSwitchExamples {
    public static void main(String[] args) {
        /** No other characters allowed after the open double quotes,
         *  continue from the next line instead.
         */
        String name = """
                Fluffy""";
        System.out.println(name);

        printDayOfTheWeekIfElse(7);

        printDayOfTheWeek(6);

        printDayOrWeekend(7);

        printDayOfTheWeekOldSchool(4);
    }

    // not recommended in practice, a switch is preferred for a long list of options
    public static void printDayOfTheWeekIfElse(int day) {
        if(day == 0) {
            System.out.println("No  such thing as " + day +"th day of the week");
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
            System.out.println("No idea what day it is!");
        }
    }
    /**
     * @param day
     * break statement not required with the arrow operator
     */
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

    /**
     * @param day
     * break statement not required with the arrow operator
     * weekend days are combined in this method
     */
    public static void printDayOrWeekend(int day) {
        var result = switch (day) {
            case 0, 6 -> "It's the weekend already?";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "What day is it? I can't tell";
        };
        System.out.println(result);
    }

    public static void printDayOfTheWeekOldSchool(int day) {
        // cannot be assigned to a var
        switch (day) {
            case 0: case 6:
                System.out.println("Weekend: Let's party!");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid value");
        }
    }
}