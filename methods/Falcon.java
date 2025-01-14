/**
 * @author The Code Alchemist
 * Chapter 5: Methods, page 258
 * Method overloading occurs when methods in the same class have the same name, but different method signatures
 * The following 5 fly methods are overloaded to be called with different method signatures.
 * Look at the parameter Lines 9 - 13
 *
 * We can overload by changing anything in the parameter list, such as the number and order of parameters
 */
package methods;
public class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
}
