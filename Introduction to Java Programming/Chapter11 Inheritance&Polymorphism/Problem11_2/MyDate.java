import java.util.Date;

public class MyDate {
    Date date;  // Date Object
    int year;   // Year
    int month;  // Month
    int day;    // Day

    public MyDate() {

        date  = new Date();
        year  = date.getYear();
        month = date.getMonth();
        day   = date.getDay();
    }
}
