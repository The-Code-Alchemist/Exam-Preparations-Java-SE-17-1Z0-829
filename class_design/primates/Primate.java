/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 301 - 302
 * Order of initialization with inheritance
 *
 * 1. Start with the call to the Chimpanzee() to determine which constructors will be executed
 * 2. Constructors are executed from the bottom up, since the call to every constructor is a call to another constructor
 * 3. The flow ends up with the parent constructor executed before the child constructor
 */
package class_design.primates;
public class Primate {
    public Primate() {
        super();                            // Inserted implicitly
        System.out.print("Primate-");
    }
}