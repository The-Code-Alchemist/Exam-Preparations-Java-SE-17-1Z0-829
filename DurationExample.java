import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author The Code Alchemist
 * Chapters 4: Core APIs, 202, 203
 * Durations based on Dates and Times
 */
public class DurationExample {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1);                                 // PT24H
        System.out.println(daily);
        // can be rewritten as
        daily = Duration.of(1, ChronoUnit.DAYS);                // PT24H
        System.out.println(daily);

        var halfDaily = Duration.ofHours(12);                            // PT12H
        System.out.println(halfDaily);
        // can be rewritten as
        halfDaily = Duration.of(1, ChronoUnit.HALF_DAYS);       // PT12H
        System.out.println(halfDaily);

        var hourly = Duration.ofHours(1);                              // PT1H
        System.out.println(hourly);
        // can be rewritten as
        hourly = Duration.of(1, ChronoUnit.HOURS);              // PT1H
        System.out.println(hourly);

        var everyMinute = Duration.ofMinutes(1);                       // PT1M
        System.out.println(everyMinute);
        // can be rewritten as
        everyMinute = Duration.of(1, ChronoUnit.MINUTES);       // PT1M
        System.out.println(everyMinute);

        var everyTenSeconds = Duration.ofSeconds(10);                   // PT10S
        System.out.println(everyTenSeconds);
        // can be rewritten as
        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);  // PT10S
        System.out.println(everyTenSeconds);

        var everyMilli = Duration.ofMillis(1);                          // PT0.001S
        System.out.println(everyMilli);
        // can be rewritten as
        everyMilli = Duration.of(1, ChronoUnit.MILLIS);         // PT0.001S
        System.out.println(everyMilli);

        var everyNano = Duration.ofNanos(1);                            // PT0.000000001S
        System.out.println(everyNano);
        // can be rewritten as
        everyNano = Duration.of(1, ChronoUnit.NANOS);           // PT0.000000001S
        System.out.println(everyNano);

        var one = LocalTime.of(5, 15);
        System.out.println(one);                                        // 05:15

        var two = LocalTime.of(6, 30);
        System.out.println(two);                                        // 06:30
        System.out.println(ChronoUnit.HOURS.between(one, two));         // 1    Truncated such as int values after division
        System.out.println(ChronoUnit.MINUTES.between(one, two));       // 75

        var date = LocalDate.of(2016, 1, 20);
        // java.time.DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2016-01-20 of type java.time.LocalDate
        System.out.println(ChronoUnit.MINUTES.between(one, date));
    }
}
