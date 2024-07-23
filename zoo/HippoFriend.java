/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 298
 * Initializing Objects
 */
package zoo;
public class HippoFriend {
    public static void main(String[] args) {
        System.out.print("C");
        // invokes the static initializers from Animal and Hippo, in that order
        new Hippo(11);
    }
}
