/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 283
 * applying the this reference
 */
package zoo;
public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        this.color = color;     // when replaced with color = color; line 15 will print null
    }
    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("PINK");             // not using "this" will keep PINK inside the setColor method
        System.out.println(f.color);    // resulting in null
    }
}
