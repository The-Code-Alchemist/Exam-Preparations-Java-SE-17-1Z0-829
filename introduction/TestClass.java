package introduction;

/**
 * @author The Code Alchemist
 * from the Introduction: xxxii
 * Just another Hello World program
 */

// Add necessary imports here
public class TestClass {
    public static void main(String[] args) {
        // Add test code here

        // Add any print statements here
        System.out.println("Hello World!");

        /*
         * These arguments are passed to the main method of {@link Zoo}
         * Based on calling the main method from another class from page 9
         */
        String[] arguments = {"Hi", "Hello", "Howdy"};
        Zoo.main(arguments);
    }
}
