package oop.calendar;

public class CalendarDay {
    private final int year;
    private final int month;
    private final int day;
    private String notes;

    public CalendarDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean hasNote() {
        return notes != null && !"".equals(notes);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CalendarDay{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", notes='" + notes + '\'' +
                '}';
    }
}
