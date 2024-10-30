/**
 * @author The Code Alchemist
 * from Chapter 3: Making Decisions, page 123
 * do/while loop introduction
 */
package making_decisions;
public class DoWhileLoopIntroduction {
    public static void main(String[] args) {
        eatAtLeastOnce();
    }

    public static void eatAtLeastOnce() {
        int lizard = 0;
        /**
         * The do/while statement is similar to the while statement,
         * except its boolean condition is checked at the end.
         * First the block is executed. The boolean condition is checked second.
         * Even if its boolean condition is false right away, the do/while statement is executed at least once.
         *
         */
        do {
            lizard++;
            System.out.println("eating at least once!");
        } while (false);
        System.out.println(lizard);
    }
}
