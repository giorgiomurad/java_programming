// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 5 : Methods
//
// Listing 5.7 : Write a program that prints the first 50 prime numbers.
//               (10 prime numbers per line)
//
//
// Author : Giorgio Murad

public class Main {
    public static void main(String[] args) {

        // Printing
        printPrimeNumbers(50);
    }


    // Method that prints 'nb' prime numbers
    public static void printPrimeNumbers(int nb) {
        int count = 0;  // Number of loop iterations
        int number= 2;  // Temporary prime number


        // Printing the first 50 prime numbers
        while (count < nb) {

            if (isPrime(number)) {

                if (count % 10 == 0)
                    System.out.println();

                System.out.printf("%3d  ", number);

                count++;
            }

            number++;
        }
    }


    // Method that returns true if the number is prime, false otherwise
    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }
}