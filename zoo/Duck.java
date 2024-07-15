/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 283, 284
 * this reference
 */
package zoo;
public class Duck {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
        length = this.length;   // backwards, that's no good
        height = theHeight;     // correct because of different variable names
        this.color = "white";   // correct, but this reference is not required
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        // 0 1 white // instance value of length is 0
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}
