/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 293
 * calling super properly and inproperly
 */
package class_design;
public class Zoo {
    public Zoo() {
        super();
        System.out.println("Zoo created");
//      super();    // DOES NOT COMPILE, must be the first and ONLY the first statement in the constructor body
    }
}
