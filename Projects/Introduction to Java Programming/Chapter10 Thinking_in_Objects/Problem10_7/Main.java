// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Problem 10.7 : Using the Account class created in Exercise 8.7,
//                Create ten accounts with IDs 0 to 9, and initial balance $100.
//                The system prompts the user to log in with one of the IDs.
//                Once logged in, the main menu is displayed to the user with different
//                choices:
//                  1) Viewing the current balance
//                  2) Withdrawing from the balance
//                  3) Deposit into the balance
//                  4) Exit
//
//
// Author : Giorgio Murad
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Scanner input = new Scanner(System.in);
        int id, choice;


        // Creating and initializing the ten accounts
        for (int i = 0; i < 10; i++)
            accounts[i] = new Account(i, 100);


        // Prompting the user to log in with one of the account IDs
        System.out.print("Enter ID: ");
        id = input.nextInt();


        // Validating inputted integer
        while (id < 0 || id > 10) {

            System.out.print("Invalid ID!" +
                    "\nPlease Try Again:");
            id = input.nextInt();
        }
        System.out.println("Logged In.");
        System.out.println();


        // Displaying main menu
        do {
            System.out.print("Main Menu:" +
                    "\n1) Check Balance" +
                    "\n2) Withdraw" +
                    "\n3) Deposit" +
                    "\n4) Exit" +
                    "\nEnter choice: ");
            choice = input.nextInt();

            // Executing Choice
            switch (choice) {
                case 1 ->
                    System.out.println("Current Balance " + accounts[id].getBalance());

                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    choice= input.nextInt();

                    if (choice < accounts[id].getBalance() && choice > 0) {
                        accounts[id].withdrawAmount(choice);
                        System.out.println("Amount Withdrawn.");
                    }
                    else
                        System.out.println("Invalid Amount. Withdrawal Cancelled.");
                }

                case 3 -> {
                    System.out.print("Enter amount to deposit: ");
                    choice = input.nextInt();

                    if (choice > 0) {
                        accounts[id].depositAmount(choice);
                        System.out.println("Amount Deposited.");
                    }
                    else
                        System.out.println("Invalid Amount. Deposit Cancelled.");
                }
                
                case 4 -> 
                    System.out.println("Have a Nice Day.:)");
            }
            System.out.println();
        } while (choice != 4);

        input.close();
    }
}