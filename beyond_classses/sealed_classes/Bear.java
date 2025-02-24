/**
 * @author The Code Alchemist
 * Chapter 7: Beyond Classes, pages 367
 * A sealed class declares a list of classes that can extend it. Classes Kodiak and Panda are permitted to extend Bear
 */
package beyond_classses.sealed_classes;
public sealed class Bear permits Kodiak, Panda {
}
