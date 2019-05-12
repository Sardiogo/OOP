import java.time.*;

public class Calendar
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        // LocalDate date = LocalDate.of(2019, 06, 01);
        // construct an object that is initialized with the current
        // date. date is a object variable that refers to a
        // constructed object of type LocalDate

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // Set to start of month

        DayOfWeek weekday = date.getDayOfWeek();
        /*
         * java.time.DayOfWeek - DayOfWeek is an enum representing 7
         * days of the week ( Monday, Tuesday, Wednesday, Thursday,
         * Friday, Saturday and Sunday.)
         */
        /*
         * getDayOfWeek() is a method of LocalDate class;
         * java.time.LocalDate - getDayOfWeek() - Gets the
         * day-of-week field, which is an enum DayOfWeek.
         */

        int value = weekday.getValue();
        // get a numerical value for the weekday (1 = Monday, ... ,
        // 7 = Sunday)

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month)
        {
            // keep iterating while date is still in the current month
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                // getValue() is a method of the enumerated type DayOfWeek;
                // In Java enums can have constructors, methods, fields…
                // They really are like classes, with only a few specific
                // differences.
                System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1)
            // If the month doesn't end at a Sunday print a new line
            System.out.println();
    }
}