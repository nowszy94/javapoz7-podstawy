package dates;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTest {

    private static int counter = 0;

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        showLocalDate(now);

        LocalDate yesterday = now.plusDays(30);
        showLocalDate(yesterday);

        System.out.println(counter);
    }

    private static void showLocalDate(LocalDate now) {
        counter++;
        System.out.println(now.getMonth());
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfWeek().getValue());
    }
}
