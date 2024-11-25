/**
 * @author The Code Alchemist
 * Chapter 5: Methods, pages 228 - 229
 * declaring local and instance variables
 */
package methods;
public class Lion {
    int hunger  = 4;                    // instance variable created every object of the Lion class

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