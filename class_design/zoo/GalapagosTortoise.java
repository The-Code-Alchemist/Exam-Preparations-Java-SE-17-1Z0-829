/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 308
 */
package class_design.zoo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GalapagosTortoise extends Reptile {
    // The more accessible public modifier is allowed for these overridden methods

    // FileNotFoundException narrower than FileNotFoundException allowed
    public void sleep() throws FileNotFoundException {}

    // Will not compile, hide() method in Reptile does not throw a checked Exception in its parent class Reptile
//    public void hide() throws FileNotFoundException {}

    // Will not compile, exitShell() throws the broader IOException than FileNotFoundException
//    public void exitShell() throws IOException {}
}
