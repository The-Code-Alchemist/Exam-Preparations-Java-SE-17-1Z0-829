/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 298
 * Initializing Objects
 */
package class_design;
public class HippoFriend {
    public static void main(String[] args) {
        System.out.print("C");
        // invokes the static initializers from Animal and Hippo, in that order - printing "CAB" once
        new Hippo(11);
    }
}
