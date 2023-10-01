public class Faculty extends Employee{
    String rank;            // Faculty member's rank
    int officeHours;     // Office hours of faculty member


    // Constructor for the faculty member
    public Faculty(
            String name, String address, String emAddr,
            int phNumber, String office, int salary,
            String rank, int officeHours
    ) {

        super(name, address, emAddr, phNumber, office, salary);
        setRank(rank);
        setOfficeHours(officeHours);
    }


    // Method that sets the rank of the faculty member
    public void setRank(String rank) {

        this.rank = rank;
    }

    // Method that sets the office hours of the member
    public void setOfficeHours(int officeHours) {

        this.officeHours = officeHours;
    }

    // Method that returns the members rank
    public String getRank() {

        return rank;
    }

    // Method that returns the office hours
    public int getOfficeHours() {

        return officeHours;
    }

    // toString method
    public String toString() {

        return super.toString() +
                "\n \t Position \t : Faculty Member";
    }
}
