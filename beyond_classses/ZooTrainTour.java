/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 360 - 361
 *
 * static methods such as slowDown() cannot call a default or private method such as playHorn().
 * Not without an explicit reference object.
 */
package beyond_classses;
public interface ZooTrainTour {
    abstract int getTrainName();    // Can be accessed by a default method associated with the instance
    private static void ride() {}   // Can be accessed by any default or static method in this interface
    default void playHorn() {
        getTrainName();
        ride();
    }

    // Cannot call default playHorn() method from a static method
    public static void slowDown() {
        // playHorn();     // will not compile
    }
    static void speedUp() {
        ride();
    }
}
