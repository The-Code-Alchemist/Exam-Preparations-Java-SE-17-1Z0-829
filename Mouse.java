/**
 * from Chapter 1: Building Blocks, page 47
 * Variables in and out of scope
 */
public class Mouse {
    final static int MAX_LENGTH = 5;
    int length;
    public void grow(int inches) {
        if(length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
