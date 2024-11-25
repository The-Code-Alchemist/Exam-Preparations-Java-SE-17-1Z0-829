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

    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;                             // only one modifier can be applied to a local variable - final
        if(isWeekend) rest = 5; else rest = 20;     // rest can be assigned a value conditionally, even when marked final
        System.out.println(rest);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

        /**
         * variables marked final cannot be reassigned
         */
//        rest = 10;                      // will not compile
//        giraffe = new Animal();         // will not compile
//        friends = null;                 // will not compile
    }
}