package oop.calendar;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        CalendarMonth calendarMonth = CalendarMonth.of("March", 2018, 3, 31, 4);
        do {
            System.out.println("1. Show month");
            System.out.println("2. Switch month {month numberOfDays startingWeekDay}");
            System.out.println("0. End");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    break;
                case 2:
                    switchMonth(scanner);
                    break;
                default:
                    System.out.println("Invalid command");
            }

        } while (answer != 0);
    }

    private static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        System.out.println(calendarMonth);
        System.out.println("1. Add note, 2. Show note, 3. Remove note");
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                int dayNumber = scanner.nextInt();
                String note = scanner.nextLine();
                calendarMonth.setNoteForDay(note, dayNumber);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    private static void switchMonth(Scanner scanner) {

    }

//    public static void main(String[] args) {
//
//    }
}
