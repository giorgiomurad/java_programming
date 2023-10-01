public class Employee extends Person{
    MyDate dateHired;   // Date the employee was hired
    String office;      // Employee's office
    int salary;         // Employee's salary


    // Constructor that creates an employee object
    public Employee(
            String name, String address, String emAddr, int phNumber,
            String office, int salary
    ) {

        super(name, address, emAddr, phNumber);
        setOffice(office);
        setSalary(salary);
        setDateHired();
    }


    // Method that sets the office of the employee
    public void setOffice(String office) {

        this.office = office;
    }

    // Method that sets the employee's salary
    public void setSalary(int salary) {

        this.salary = salary;
    }

    // Method that sets the date the employee was hired
    public void setDateHired() {

        dateHired = new MyDate();
    }

    // Method that returns the employee's office
    public String getOffice() {

        return office;
    }

    // Method that returns the employee's salary
    public int getSalary() {

        return salary;
    }

    // Method that returns the date the employee was hired
    public MyDate getDateHired() {

        return dateHired;
    }

    // toString Method
    public String toString() {

        return super.toString() +
                "\nClass \t : Employee";
    }
}
