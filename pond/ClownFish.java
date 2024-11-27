/**
 * @author The Code Alchemist
 * from Chapter 5: Methods, page 237 - 242
 * protected fields can be accessed by classes outside their package through inheritance
 *
 * This subclass gains access to all prutected and public members of its parent class pond.Fish
 * as if they were declared in the subclass.
 *
 * package-private and private members of pond.Fish are still not accessible!
 */
package pond;
public class ClownFish extends Fish {

    public static void main(String[] args) {
        System.out.println(name);   // name from pond.Fish shown
    }
}