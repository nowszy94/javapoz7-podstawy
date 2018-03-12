package oop.calendar;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        CalendarMonth calendarMonth = CalendarMonth.currentMonth();
        do {
            System.out.println("1. Show month - " + calendarMonth.getName());
            System.out.println("2. Switch month {year month}");
            System.out.println("3. Next month");
            System.out.println("4. Previous month");
            System.out.println("0. End");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    scanner.nextLine();
                    break;
                case 2:
                    calendarMonth = switchMonth(scanner);
                    scanner.nextLine();
                    break;
                case 3:
                    calendarMonth = nextMonth(calendarMonth);
                    scanner.nextLine();
                    break;
                case 4:
                    calendarMonth = previousMonth(calendarMonth);
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid command");
            }

        } while (answer != 0);
    }

    private static CalendarMonth previousMonth(CalendarMonth calendarMonth) {
        int actualMonth = calendarMonth.getMonth();
        int previousYear = calendarMonth.getYear() - (actualMonth == 1 ? 1 : 0);
        int previousMonth = actualMonth == 1 ? 12 : actualMonth - 1;
        calendarMonth = CalendarMonth.ofMonth(previousYear, previousMonth);
        return calendarMonth;
    }

    private static CalendarMonth nextMonth(CalendarMonth calendarMonth) {
        int currentMonth = calendarMonth.getMonth();
        int nextYear = calendarMonth.getYear() + (currentMonth == 12 ? 1 : 0);
        int nextMonth = currentMonth == 12 ? 1 : currentMonth + 1;
        calendarMonth = CalendarMonth.ofMonth(nextYear, nextMonth);
        return calendarMonth;
    }

    private static CalendarMonth switchMonth(Scanner scanner) {
        CalendarMonth calendarMonth;
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        calendarMonth = CalendarMonth.ofMonth(year, month);
        return calendarMonth;
    }

    private static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        int option;
        do {
            System.out.println(calendarMonth);
            System.out.println("1. Add note, 2. Show note, 3. Remove note");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNote(scanner, calendarMonth);
                    break;
                case 2:
                    showNote(scanner, calendarMonth);
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    int dayNumber = scanner.nextInt();
                    calendarMonth.setNoteForDay(null, dayNumber);
                    break;
                default:
                    option = 0;
            }
        } while (option != 0);
    }

    private static void addNote(Scanner scanner, CalendarMonth calendarMonth) {
        int dayNumber = scanner.nextInt();
        String note = scanner.nextLine();
        calendarMonth.setNoteForDay(note, dayNumber);
    }

    private static void showNote(Scanner scanner, CalendarMonth calendarMonth) {
        int numberOfDayToShow = scanner.nextInt();
        CalendarDay calendarDay = calendarMonth.getCalendarDay(numberOfDayToShow);
        if (calendarDay.hasNote()) {
            System.out.println(calendarDay.getNotes());
        } else {
            System.out.println("No notes available for this day");
        }
    }
}
