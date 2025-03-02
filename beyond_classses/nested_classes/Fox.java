/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 385 - 386
 */
package beyond_classses.nested_classes;
public class Fox {
    private class Den {}

    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
//        new Den(); // Cannot call from within a static method. Would compile with a Fox reference
    }
}
