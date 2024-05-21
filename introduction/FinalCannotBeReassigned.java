package introduction;

import java.util.logging.Logger;

/**
 * @author The Code Alchemist
 * from the Introduction
 */
public class FinalCannotBeReassigned {

    public static void main (String[] args) {

        // xxvi - a final value cannot be reassigned
        final Logger myLogger = Logger.getAnonymousLogger();
//        myLogger = Logger.getLogger(String.class.getName());
        System.out.println(myLogger);

        // xxix - this just compiles fine
        var $num = (Integer)null;
        System.out.println($num);

        // xxxii - double cannot be assigned to float without casting
//        float value = 102.0;
    }
}
