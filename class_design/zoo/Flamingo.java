/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, pages 283
 * this reference example
 */
package class_design.zoo;
public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        color = color;          // makes line 14 print PINK when replaced with | this.color = color |
    }
    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
    }
}
