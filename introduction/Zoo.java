package introduction;

/**
 *  @author The Code Alchemist
 *  from Chapter 1: Building Blocks, page 8
 *  Compile the source file Zoo.java from the root directory of the project             javac introduction/Zoo.java
 *  Run the newly compiled bytecode Zoo.class from the root directory of the project    java introduction/Zoo
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*
         * These arguments are passed from {@link TestClass}
         * If this class is run directly, these arguments will not be shown.
         * Based on page 9
         */
        if(args.length > 0) {
            System.out.println(args.length);
            System.out.println(args[0] + " " + args[1]);
            System.out.println(args[2]);
        }
    }
}
