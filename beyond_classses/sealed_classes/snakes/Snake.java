/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 370 - 371
 * The permits clause is optional in the Snake class here. If the classes were in separate source files, this code would
 * not have compiled. However, Cobra still has to use extends.
 */
package beyond_classses.sealed_classes.snakes;
public sealed class Snake
// permits Cobra // this part is optional if the permitted class is in the same source code
{}
final class Cobra extends Snake {}