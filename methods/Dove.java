/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 259
 * The methods here are properly overloaded, because of the different type of parameters
 */
package methods;

public class Dove {
    public void fly(int numMiles) {
        System.out.println("int");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }
}
