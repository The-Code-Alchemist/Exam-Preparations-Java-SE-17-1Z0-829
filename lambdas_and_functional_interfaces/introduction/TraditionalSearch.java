/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, pages 420 - 422
 */
package lambdas_and_functional_interfaces.introduction;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check, we only care if the animal can hop
        print(animals, a -> a.canHop());

        // check for animals that can swim
        print(animals, a -> a.canSwim());

        // check for animals that cannot swim, the next two lines do the exact same thing
        print(animals, a -> !a.canSwim());
        print(animals, (Animal a) -> { return !a.canSwim();});

    }
    // The checker parameter on the right is a lambda expression
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {

            // General check
            if(checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}