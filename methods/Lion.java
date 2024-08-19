/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 228, 229
 * declaring local and instance variables
 */
package methods;
public class Lion {
    int hunger  = 4;

    public int feedZooAnimals() {

        final var i = 40;
        final var o = new Object();

        int snack = 10;                 // local variable - does not exist outside of this method

        if (snack > 4) {
            long dinnerTime = snack++;  // another local variable - limited only to this if condition
            hunger--;
        }
        return snack;
    }
}