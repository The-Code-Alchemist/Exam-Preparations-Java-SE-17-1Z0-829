/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 308
 */
package class_design.zoo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleep() throws IOException {}
    protected void hide() {}
    protected void exitShell() throws FileNotFoundException {}
}
