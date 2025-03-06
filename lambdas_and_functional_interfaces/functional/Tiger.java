/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 426
 * This class implements a Functional
 */
package lambdas_and_functional_interfaces.functional;
public class Tiger implements Sprint {
    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}