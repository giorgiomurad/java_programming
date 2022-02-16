// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Problem 5.26 : Write a program that prints the first 100 palindromic numbers (10 numbers per line).
//                A palindromic number is a palindrome number that is also prime. (131, 313, 757).
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {
        int temp;   // Temporary Integer
        int count;  // Number of palindromic integers
        boolean br; // Line-Break


        // Initializing values
        temp  = 2;
        count = 0;
        br    = false;

        // Printing the first 100 palindromic numbers
        // 10 numbers per line
        while(count < 100) {

            if (isPalindromic(temp)) {
                System.out.printf("%7d", temp);

                count++;
                br = true;
            }

            temp++;
            if (count % 10 == 0 && br) {

                System.out.println();
                br = false;
            }
        }
    }


    // Method that returns true if the given number is palindromic, false otherwise
    public static boolean isPalindromic(int number) {

        return (isPrime(number) && isPalindrome(number));
    }


    // Method that returns true if the given number is prime, false otherwise
    public static boolean isPrime(int number) {
        int temp;   // Temporary Integer

        temp = 2;
        while (temp < number) {

            if (number % temp == 0)
                return false;

            temp++;
        }

        return true;
    }


    // Method that returns true if the given number is a palindrome, false otherwise
    public static boolean isPalindrome(int number) {
        int reversal;   // Reversal of the number
        reversal = reversal(number);


        // Result
        return (number == reversal);
    }


    // Method that returns the reversal of an integer
    public static int reversal(int number) {
        int reversal;   // Reversal of the given number
        int temp;       // Temporary Integer


        // Computing value of reversal
        reversal = 0;
        while (number > 0) {
            temp = number % 10;

            reversal = reversal * 10 + temp;
            number /= 10;
        }

        // Returning the reversal
        return reversal;
    }
}

/* Important Mistake:
 * 
 * Before deploying variable 'br' of type boolean,
 * the output displayed alot of line-breaks instead of one for every ten numbers
 */