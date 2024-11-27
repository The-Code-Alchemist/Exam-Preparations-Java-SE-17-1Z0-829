/**
 * @author The Code Alchemist
 * Chapter 6: Class Design, page 302
 * constructor call example
 */
package zoo;
public class CuttleFish {
    private static String name = "swimmy";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    { COUNT++; System.out.println(COUNT); }


}
