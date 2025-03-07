/**
 * @author The Code Alchemist
 * Chapter 8: Lambdas and Functional Interfaces, page 429
 * Method reference example
 */
package lambdas_and_functional_interfaces.method_references;
public class Duckling {
    public void makeSound(String sound) {
        // LearnToSpeak learner = s -> System.out.println(s);   // Less desirable and more redundant than the method reference on line 9
        LearnToSpeak learner = System.out::println;             // Tells Java to call the println() method later
        DuckHelper.teacher(sound, learner);
    }
}