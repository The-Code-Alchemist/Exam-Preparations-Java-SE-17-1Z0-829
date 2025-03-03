/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 387 - 388
 * Local class Calculator defined in the calculate() method
 */
package beyond_classses.nested_classes;
public class PrintNumbers {
    private int length = 5;     // effectively final
    public void calculate() {
        final int width = 20;

        // The local class
        class Calculator {
            public void multiply() {
                // effectively final instance variable and a final local variable
                System.out.println(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }
    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();    // 100
    }
}