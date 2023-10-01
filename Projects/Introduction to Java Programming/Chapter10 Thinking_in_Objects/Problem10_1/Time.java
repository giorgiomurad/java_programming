import java.util.Date;

public class Time {
    private Date date;      // Date Object
    private int hour;       // Hour
    private int minute;     // Minute
    private int second;     // Second


    // No-arg constructor that creates a time object for the current time
    public Time() {
        long time = System.currentTimeMillis();

        setTime(time);
    }

    // Constructor that creates a time object with the specified elapse time
    public Time(long elapseTime) {

        setTime(elapseTime);
    }

    // Constructor that creates an object with specified hour, minute, and second
    public Time(int hour, int minute, int second) {

        this.hour   = hour;
        this.minute = minute;
        this.second = second;
    }

    // Setter method that sets a new time for the object
    public void setTime(long elapseTime) {

        date   = new Date(elapseTime);
        hour   = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    // Method that returns a string containing the data field values
    public String toString() {
        String s = String.format(
                "Hour \t= %d" +
              "\nMinute \t= %d" +
              "\nSecond \t= %d",
                hour, minute, second
        );

        return s;
    }
}
