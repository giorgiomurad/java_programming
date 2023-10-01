// Location Class
public class Location {
    public int row;
    public int column;
    public double maxValue;


    // Constructor that creates a location object with the specified row and column
    public Location(int newRow, int newColumn) {

        row = newRow;
        column = newColumn;
        maxValue = 0;
    }

    // Constructor that creates a location object with the specified row, column, and maximum value
    public Location(int newRow, int newColumn, double newMax) {

        row = newRow;
        column = newColumn;
        maxValue = newMax;
    }


    // Method that locates the largest value in a two-dimensional array
    public static Location locateLargest(double[][] x) {
        double temp;
        int r, c;


        r = 0;
        c = 0;
        temp = 0;
        for (int ar = 0; ar < x.length; ar++) {
            for (int ac = 0; ac < x[ar].length; ac++) {

                if (x[ar][ac] > temp) {

                    temp = x[ar][ac];
                    r = ar;
                    c = ac;
                }
            }
        }

        return new Location(r, c, temp);
    }
}
