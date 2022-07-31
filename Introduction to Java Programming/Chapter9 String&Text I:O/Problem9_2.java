// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.2 : Write a program that prompts the user to enter two strings.
//               Write a function that verifies whether the second string is
//               a substring of the first.
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String string1;     // String 1
         String string2;     // String 2


         // Prompting the user to enter the two strings
         System.out.println("Enter the two strings to verify whether the second string " +
                 "is the substring of the first or not:");
         string1 = input.next();
         string2 = input.next();

         // Informing the user if the second string is the substring of the first or not
         if (isSubString(string1, string2))
             System.out.println(string2 + " is the substring of " + string1);
         
         else 
             System.out.println(string2 + " is not the substring of " + string1);
     }


     // Method that returns true if the second string is a substring of the first string. False otherwise.
     public static boolean isSubString(String s1, String s2) {

         for (int i = 0; i < s1.length(); i++)
             if (s1.charAt(i) == s2.charAt(0)) {
                 int end;


                 end = s2.length();
                 if (s2.equals(s1.substring(i, i+end)))
                     return true;
             }

         return false;
     }
 }