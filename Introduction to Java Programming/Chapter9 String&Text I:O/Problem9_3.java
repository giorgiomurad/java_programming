// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// String & Text I/O
//
// Problem 9.3 : Write a program that prompts the user to enter a password.
//               If the rules of the password apply, the program should display "Valid Password",
//               and "Invalid Password" otherwise.
//               The three rules that should apply for a valid password are as follows:
//               - Must have eight characters
//               - Must consist only of letters and characters
//               - Must contain only two digits
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

class Main {
     public static void main(String[] args) {
         String password;   // Password entered by the user


         // Prompting the user to enter a password
         password = JOptionPane.showInputDialog("Enter password for verification:");

         // Verifying if the password is valid or not, and informing the user
         if (isValid(password))
             System.out.println("Password is Valid");

         else
             System.out.println("Invalid Password");
     }

     // Method that checks whether the password is valid or not
     public static boolean isValid(String pass) {

         if (eightCharacters(pass)) {
             if (lettersDigits(pass)) {
                if (hasTwoDigits(pass)) {

                    return true;
                }
             }
         }

         return false;
     }

     // Method that checks whether the password has eight characters
     public static boolean eightCharacters(String pass) {

         return (pass.length() == 8);
     }

     // Method that checks whether consists of only letters and digits
     public static boolean lettersDigits(String pass) {

         for (char ch : pass.toCharArray()) {
             if (Character.isLetter(ch) || Character.isDigit(ch)) {

                 return true;
             }
         }

         return false;
     }

     // Method that verifies that the password only contains two digits
     public static boolean hasTwoDigits(String pass) {
         int count; // Number of Digits

         count = 0;
         for (char ch : pass.toCharArray()) {
             if (Character.isDigit(ch)) {

                 count++;
             }
         }

         return (count == 2);
     }
 }