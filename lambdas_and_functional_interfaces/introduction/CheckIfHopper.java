/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, pages 420 - 422
 */
package lambdas_and_functional_interfaces.introduction;
public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}