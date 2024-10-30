/**
 * @author The Code Alchemist
 * From Java SE 17 Fundamentals, infininte while loop example
 * Chapters 3: Making Decisions, pages 123-124
 */
package making_decisions;
public class InfiniteLoopExample {
    public static void main(String[] args) {
        executeIndefinitelyWithoutIncrement();
    }

    /**
     * Infinite loops keep going on forever, unless the user terminates them manually.
     * Infinite loops are unintentional most of the time
     * When writing a loop, any loop, make sure they all terminate.
     * You may get overflow exceptions, memory leaks, slow performance and bad data to name some examples
     */
    public static void executeIndefinitelyWithoutIncrement() {
        int pen = 2;
        int pigs = 5;
        while(pen < 10) // make sure this condition evaluates to false at some point
        {
            pigs++;
            pen++; // comment out this line to keep the next line going without terminating
            System.out.println("This loop keeps going forever if pen gets no increment. pen = " + pen);
        }
    }
}
