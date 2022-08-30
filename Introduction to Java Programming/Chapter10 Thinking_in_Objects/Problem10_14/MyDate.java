import java.util.GregorianCalendar;

public class MyDate {
    GregorianCalendar g;    // Gregorian Calendar Object
    private int year;       // Year
    private int month;      // Month
    private int day;        // Day

    // No-arg constructor that creates a MyDate object with the current time
    public MyDate() {

        this(System.currentTimeMillis());
    }

    // A constructor that creates an object with the specified elapse time since Jan. 1, 1970
    public MyDate(long elapseTime) {

        setDate(elapseTime);
    }

    // Constructor that creates the object with the given year, month, and day
    public MyDate(int year, int month, int day) {

        this.year  = year;
        this.month = month;
        this.day   = day;
    }


    // Method that sets the date for the object with the given elapse time
    public void setDate(long elapseTime) {
        // Setting up the gregorian calendar object
        g = new GregorianCalendar();
        g.setTimeInMillis(elapseTime);

        // Assigning values for year, month, and day
        year  = g.get(GregorianCalendar.YEAR);
        month = g.get(GregorianCalendar.MONTH)+1;
        day   = g.get(GregorianCalendar.DAY_OF_MONTH);

        // Note:
        // According to the GregorianCalendar Object,
        // The month number of January is zero.
    }

    // Method that returns the year
    public int getYear() {

        return year;
    }

    // Method that returns the month number
    public int getMonth() {

        return month;
    }

    // Method that returns the day of the month
    public int getDay() {

        return day;
    }

    // Method that returns the year, month, and day in a single string value
    public String toString() {
        String month;
        int year, day;


        year = this.year;
        day  = this.day;

        month = "";
        switch (this.month) {
            case 1 ->
                    month = "January";

            case 2 ->
                    month = "February";

            case 3 ->
                    month = "March";

            case 4 ->
                    month = "April";

            case 5 ->
                    month = "May";

            case 6 ->
                    month = "June";

            case 7 ->
                    month = "July";

            case 8 ->
                    month = "August";

            case 9 ->
                    month = "September";

            case 10 ->
                    month = "October";

            case 11 ->
                    month = "November";

            case 12 ->
                    month = "December";
        }


        return String.format("%s %d %d", month, day, year);
    }
}
