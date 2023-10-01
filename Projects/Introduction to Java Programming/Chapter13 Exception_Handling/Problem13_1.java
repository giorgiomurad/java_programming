// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Exception Handling
//
// Problem 13.1 : Write a simple calculator program that runs from the command line.
//                The program prompts the user to enter an integer followed by an operator followed by another
//                integer value in order to display the finall result.
//                In case the user enters the wrong input, the program should inform the user.
//                (Use NumberFormatException)
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        String operator;    // Mathematical Operator
        double result;      // Operation Result
        int n1, n2;         // Integer Variables


        try {
            // Retrieving Values
            n1 = Integer.parseInt(args[0]);
            operator = args[1];
            n2 = Integer.parseInt(args[2]);

            // Executing the operation
            result = switch(operator.charAt(0)) {
                case '+' -> n1 + n2;
                case '-' -> n1 - n2;
                case '*' -> n1 * n2;
                case '/' -> n1 / n2;
                default -> throw new NumberFormatException();
            };

            // Displaying Result
            System.out.printf("%2d %2s %2d = %2.2f", n1, operator, n2, result);
        
        } catch (NumberFormatException ex) {

            System.out.println("Please enter an integer value followed by a math operator " +
                    "followed by another integer value (a * b).");
        } finally {

            System.out.println("Program Closed");
        }
    }
}