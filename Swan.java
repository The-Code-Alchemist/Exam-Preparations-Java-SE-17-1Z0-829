/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, page 24
 * Object instantiation
 */
public class Swan {
    int numberEggs;                             // instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;                  // set variable
        System.out.println(mother.numberEggs);  // read variable
    }
}
