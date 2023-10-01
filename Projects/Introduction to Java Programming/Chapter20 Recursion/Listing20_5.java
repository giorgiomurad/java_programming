// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Recursion
//
// Listing 20.5 : Write a recursive method that is capable of sorting a double array.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;     // Length of the array given by the user

        
        // Prompting the user to enter the size of the array
        System.out.println("Enter the length of the array :");
        length = input.nextInt();
        
        // Creating the double array given the size
        double[] nbs = new double[length];
        
        // Prompting the user to enter the values of the array
        System.out.println("Enter the " + length + " values of the array (each value separated by a space):");
        for (int i = 0; i < length; i++)
            nbs[i] = input.nextDouble();
        
        // Displaying the array
        System.out.println("Original Array:");
        for (double j : nbs)
            System.out.print(j + " ");

        // Sorting the array
        sort(nbs);
        System.out.println();

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (double j : nbs)
            System.out.println(j + " ");
    }


    // Method that sorts an array of decimals
    public static void sort(double[] list) {

        sort(list, 0, list.length-1);
    }

    // Method that sorts an array of decimals given the array, low index of the array, and high index of the array
    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];

            for (int i = low+1; i <= high; i++)
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }

            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low+1, high);
        }
    }
}