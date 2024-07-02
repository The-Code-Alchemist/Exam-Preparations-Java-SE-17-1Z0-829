import java.time.LocalDate;
import java.time.Month;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, 200
 * Periods based on Dates and Times
 */
public class DateAndTimeWithoutPeriodExample {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        var upTo = start;
        while(upTo.isBefore(end)) { // check if still before end
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
