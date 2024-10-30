/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 121-122
 * while loop introduction
 */
package making_decisions;
public class WhileLoopIntroduction {
    public static void main(String[] args) {

        /**
         * Two separate methods to execute two while loops.
         * Comment out one or the other to see the change in results quickly
         * Methods will be revisited in Chapter 5: Methods. Refer to the "methods package for some examples"
         */
        introduceWhileLoop();
        eatCheese(4);
        eatingExample();
    }

    private static void introduceWhileLoop() {
        int counter = 0;
        /**
         * The while statement is the simplest repetitive control structure
         * The while loop has a termination condition, implemented as a boolean expression
         * This loop continues as long as the boolean condition evaluates to true,
         * but terminates when the while loop evaluates to false
         */
        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
    }

    static int roomInBelly = 5;
    // A compound boolean statement is used here i.e. a boolean condition consisting of more boolean conditions
    public static void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
        System.out.println(roomInBelly + " room in belly left");
    }

    public static void eatingExample() {
        int full = 5;
        // Does not print anything, because the boolean condition is false
        while(full < 5) {
            System.out.println("Not full!");
            full++;
        }
    }
}
