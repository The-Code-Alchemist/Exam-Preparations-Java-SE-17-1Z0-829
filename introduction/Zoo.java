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

        /**
         * These arguments are passed from {@link TestClass}
         * If this class is run directly, these arguments will not be shown.
         * Based on pages 9 and 10
         */
        if(args.length > 0) {
            System.out.println(args.length);
            System.out.println(args[0] + " " + args[1]);
            System.out.println(args[2]);
        }
    }

    public void whatTypeAmI() {
        /**
         * Local variable type inference
         * Examples from page 41
         * These types of variables can't be used as instance variables, only local variables are allowed
         * Once the data type has been determined, it can no longer be changed (lines 35 & 36)
         */
        var name = "Hello";
        System.out.println(name);
        var size = 7;
        System.out.println(size);

        var x = 2;
        // x = 2l; // x can only be assigned int in order to compile
    }
}
