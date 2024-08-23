/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, 200, 201
 * Periods based on Dates and Times
 */
package coreAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
public class PeriodExample {
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        // uses the generic Period

        var upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }

        // These methods cannot be chained the same way Date and Time classes can
        var annually = Period.ofYears(1);                                   // every 1 year
        System.out.println(annually);
        var quarterly = Period.ofMonths(3);                                 // every 3 months
        System.out.println(quarterly);
        var everyThreeWeeks = Period.ofWeeks(3);                            // every 2 weeks
        System.out.println(everyThreeWeeks);
        var everyOtherDay = Period.ofDays(2);                               // every 2 days
        System.out.println(everyOtherDay);

        // takes an explicit value for years months and days
        var everyYearAndAWeek = Period.of(1, 0, 7);       // every year and 7 days
        System.out.println(everyYearAndAWeek);

        var wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong);      // P7D

        // building_blocks.var wrong can be rewritten as follows
        var wrongAgain = Period.ofYears(1);
        wrongAgain = Period.ofWeeks(1);
        System.out.println(wrongAgain); // P7D

        var right = Period.of(1, 1, 1);
        System.out.println(right);      // P1Y1M1D

        System.out.println(Period.ofMonths(3));

        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period)); // java.time.temporal.UnsupportedTemporalTypeException : Unsupported unit: Months
    }
}
