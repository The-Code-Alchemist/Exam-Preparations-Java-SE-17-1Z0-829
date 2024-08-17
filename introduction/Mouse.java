/**
 * @author The Code Alchemist
 * from Chapter 1: Building Blocks, page 47
 * Class variables stay in scope until the program ends
 * Instance variables stay in scope as long as the objects exist (until they are garbage collected)
 */
package introduction;
public class Mouse {
    final static int MAX_LENGTH = 5;    // class variable
    int length;                         // instance variable
    public void grow(int inches) {
        if(length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
