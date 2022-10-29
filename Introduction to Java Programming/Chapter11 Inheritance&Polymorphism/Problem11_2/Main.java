// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Inheritance and Polymorphism
//
// Problem 11.2 : Design a class named Person with its two subclasses named Student and Employee.
//                Faculty and Staff are two subclasses of Employee.
//                A Person has a name, address, phone number, and email address.
//                A student has a class status (freshman, sophomore, junior, senior).
//                An employee has an office, salary, and date hired. Define class MyDate containing year, month, and day
//                A faculty member has office hours and a rank.
//                A staff member has a title.
//                Override the toString() method in every class to display the class name, and the person's name.
//
//                Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes
//                their toString() methods.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Giorgio Murad", "Bsalim", "gio_murad@hotmail.com", 75847394
        );

        Student student = new Student(
                "Max Payne", "New York", "max.payne@mail.com", 65748394, "Studying..."
        );

        Employee employee = new Employee(
                "Angus Young", "Sour", "angus.young@mail.com",
                74627384, "CS", 5000
        );

        Faculty faculty = new Faculty(
                "James Bond", "Chicago", "james.bond@mail.com",
                46573645, "JB", 6475, "Spy", 6
        );

        Staff staff = new Staff(
                "Guena Zgheib", "Beirut", "guena.zgheib@mail.com",
                47592834, "ENG", 7800, "English Staff"
        );


        // Displaying Outputs
        System.out.println(person);
        System.out.println();

        System.out.println(student);
        System.out.println();

        System.out.println(employee);
        System.out.println();

        System.out.println(faculty);
        System.out.println();

        System.out.println(staff);
    }
}