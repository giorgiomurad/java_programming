// Problem taken from Introduction to Java Programming by Y. Daniel Yang (8th ed.)
// Chapter 2 : Elementary Programming
//
// Problem 2.11 : Write a program that reads the employee name, number of hours worked a week,
//                hourly pay rate, federal tax withholding rate, and the state tax withholding
//                rate.
//                The program would then display the following payroll statement:
//                Employee Name : (Smith)
//                Hours Worked  : (10)
//                Pay Rate      : ($6.75)
//                Gross Pay     : ($67.5)
//                Deduction :
//                  Federal Withholding (20%) : ($13.5)
//                  State Withholding (9%)    : ($6.07)
//                  Total Deduction           : ($19.57)
//                Net Pay       : ($47.92)
//
//
// Author : Giorgio Murad
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String s;               // String variable that retrieves user input
        String name;            // Variable carrying employee name
        double hoursWorked;     // How many hours the employee worked in a week
        double payRate;         // Employee's hourly pay rate
        double grossPay;       // Employee's gross pay rate
        double federalRate;     // Federal Withholding Rate
        double fedWithholding;  // Federal Withholding
        double stateRate;       // State Withholding Rate
        double stateWithholding;// State Withholding
        double totalDeduction;  // Total Deduction
        double netPay;          // Employee's Net Pay


        // Prompting for the employee name
        s    = JOptionPane.showInputDialog("Enter Employee Name :");
        name = s;

        // Prompting for the number of hours worked in a week
        s           = JOptionPane.showInputDialog("Enter how many hours " + name + " works every week :");
        hoursWorked = Double.parseDouble(s);

        // Prompting for the hourly pay rate
        s         = JOptionPane.showInputDialog("Enter " + name + "\'s hourly pay rate (0-1):");
        payRate   = Double.parseDouble(s);
        grossPay  = payRate * hoursWorked;

        // Prompting for the federal pay rate
        s              = JOptionPane.showInputDialog("Enter the federal withholding rate :");
        federalRate    = Double.parseDouble(s);
        fedWithholding = grossPay * federalRate;

        // Prompting for the state withholding rate
        s                = JOptionPane.showInputDialog("Enter the state withholding rate :");
        stateRate        = Double.parseDouble(s);
        stateWithholding = grossPay * stateRate;

        // Displaying Result
        totalDeduction = fedWithholding + stateWithholding;
        netPay         = grossPay - totalDeduction;
        System.out.println("Employee Name :  " + name
                       + "\nHours Worked  :  " + hoursWorked
                       + "\nPay Rate      : $" + payRate
                       + "\nGross Pay     : $" + grossPay
                       + "\nDeduction :"
                       + "\n    Federal Withholding (" + (federalRate * 100) + "%) : $" + fedWithholding
                       + "\n    State Withholding (" + (stateRate * 100) + "%)     : $" + stateWithholding
                       + "\n    Total Deduction : $" + totalDeduction
                       + "\nNet Pay       : $" + netPay);
    }
}

/* Funny Mistakes:
 * 66 - 73 : /n instead of \n
 * 63      : totalDeduction = grossPay - (fedWithholding + stateWithholding);
 */