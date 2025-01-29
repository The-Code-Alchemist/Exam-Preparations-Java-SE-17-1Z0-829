/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 283
 * this reference example
 *
 * In order to set the instance variable with the method variable, use the following line
 * this.color = color;
 */
package class_design.zoo;
public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        // assigns the method parameter to itself
        color = color;          // makes line 15 print PINK when replaced with | this.color = color;
    }
    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
    }
}
