/**
 * @author The Code Alchemist
 * from Chapter 4: Core APIs, pages n/a
 */
package coreAPIs;
public class StringConcatenationAndMethodExamples {
    public static void main(String[] args) {

        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);

        int i = 2, j = 3;
        int results = i * j;
        // Concatenation happens automatically
        String output = i + " * " + j + " = " + results;
        System.out.println(output);

        String location = "Florida";
        int FlightNumber = 175;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("I flew to ");
        stringBuilder.append(location);
        stringBuilder.append(" on Flight #");
        stringBuilder.append(FlightNumber);    // is converted to String by concatenating
        String message = stringBuilder.toString();
        System.out.println(message);

        String time = "09:00";
        int pos = stringBuilder.indexOf(" on");
        stringBuilder.insert(pos, " at ");     // 4 characters
        stringBuilder.insert(pos + 4, time);
        message = stringBuilder.toString();
        System.out.println(message);
        System.out.println(stringBuilder);
    }
}