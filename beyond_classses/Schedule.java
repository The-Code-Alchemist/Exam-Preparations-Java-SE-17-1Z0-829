/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, page 358
 * Reusing code with private interface methods
 */
package beyond_classses;
public interface Schedule {
    default void wakeUp() {
        checkTime(7);
    }

    // This method is only available in this interface
    private void haveBreakfast() {
        checkTime(9);
    }

    static void workOut() {
        checkTime(18);
    }

    static void checkTime(int hour) {
        if(hour> 17) {
            System.out.println("You're late");
        } else {
            System.out.println("You have "+(17-hour)+" hours left "
                + "to make the appointment");
        }
    }
}