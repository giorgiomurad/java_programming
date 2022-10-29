public final class Student extends Person {
    String status;  // Status of the student

    // Constructor that creates a student object
    public Student(
            String name, String address, String emAddr,
            int phNumber, String status) {

        super(name, address, emAddr, phNumber);
    }


    // Method that sets the status of the student
    public void setStatus(String status) {

        this.status = status;
    }

    // Method that returns the student's status
    public String getStatus() {

        return status;
    }

    // toString Method
    public String toString() {

        return super.toString() + "\nClass \t : Student";
    }
}
