package oop.calendar;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalendarDay calendarDay2 = new CalendarDay(2018, 3, 7);
        CalendarDay calendarDay = new CalendarDay(2018, 3, 8);
        CalendarDay calendarDay3 = new CalendarDay(2018, 3, 9);

        System.out.println("Add note");
//        calendarDay.setNotes(scanner.nextLine());
//        String notes = scanner.nextLine();
        calendarDay.setNotes("test");

        CalendarDay[] marchDays = new CalendarDay[]{
                calendarDay2, calendarDay, calendarDay3, calendarDay2, calendarDay, calendarDay3, calendarDay2, calendarDay, calendarDay3, calendarDay2, calendarDay, calendarDay3
        };
        CalendarMonth march = new CalendarMonth("March", marchDays, 4);

        System.out.println(march);
    }
}
