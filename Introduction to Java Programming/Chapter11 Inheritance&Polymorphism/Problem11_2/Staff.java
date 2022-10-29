public class Staff extends Employee{
    String title;   // Title of the staff member


    // Constructor for the staff member
    public Staff(String name, String address, String emAddr, int phNumber,
                 String office, int salary, String title) {

        super(name, address, emAddr, phNumber, office, salary);
        setTitle(title);
    }


    // Method that sets the title of the staff
    public void setTitle(String title) {

        this.title = title;
    }

    // Method that returns the titles
    public String getTitle() {

        return title;
    }

    // toString method
    public String toString() {

        return super.toString() +
                "\n \t Position \t : Staff Member";
    }
}
