public class GuessDate {
    private final static int[][][] dates = {
            {
                    {1, 3, 5, 7},
                    {9, 11, 13, 15},
                    {17, 19, 21, 23},
                    {25, 27, 29, 31}
            },
            {
                    {2, 3, 6, 7},
                    {10, 11, 14, 15},
                    {18, 19, 22, 23},
                    {26, 27, 30, 31}
            },
            {
                    {4, 5, 6, 7},
                    {12, 13, 14, 15},
                    {20, 21, 22, 23},
                    {28, 29, 30, 31}
            },
            {
                    {8, 9, 10, 11},
                    {12, 13, 14, 15},
                    {24, 25, 26, 27},
                    {28, 29, 30, 31}
            },
            {
                    {16, 17, 18, 19},
                    {20, 21, 22, 23},
                    {24, 25, 26, 27},
                    {28, 29, 30, 31}
            }
    };


    // Private constructor that prevents users from creating instances of this object
    private GuessDate() {}

    // Method that returns the date at the specified set number, row, and column
    public static int getValue(int setNo, int i, int j) {

        return dates[setNo][i][j];
    }
}
