public class Person {
    String name;        // Name of the person
    String address;     // Person's address
    String emAddr;      // Person's email address
    int phNumber;       // Person's phone number


    // Constructor that creates a person with a given name, address, phone number and email address
    public Person(String name, String address, String emAddr, int phNumber) {

        setName(name);
        setAddress(address);
        setEmAddr(emAddr);
        setPhNumber(phNumber);
    }


    // Method that sets the name of the person
    public void setName(String name) {

        this.name = name;
    }

    // Method that sets the address of the person
    public void setAddress(String address) {

        this.address = address;
    }

    // Method that sets the person's email address
    public void setEmAddr(String emAddr) {

        this.emAddr = emAddr;
    }

    // Method that sets the person's phone number
    public void setPhNumber(int phNumber) {

        this.phNumber = phNumber;
    }

    // Method that returns the name of the person
    public String getName() {

        return name;
    }

    // Method that returns the address of the person
    public String getAddress() {

        return address;
    }

    // Method that returns the email address of the person
    public String getEmAddr() {

        return emAddr;
    }

    // Method that returns the person's phone number
    public int getPhNumber() {

        return phNumber;
    }

    // toString Method
    public String toString() {
        return "Name \t : " + name;
    }
}
