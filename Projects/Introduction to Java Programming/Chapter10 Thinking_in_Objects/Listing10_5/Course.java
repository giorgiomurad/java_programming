public class Course {
    private String coarseName;      // Name of the coarse
    private String[] students;      // Names of students enrolled in the coarse
    private int numberOfStudents;   // Total number of students enrolled in the coarse


    // Constructor that initializes a coarse object with the given name
    public Course(String coarseName) {

        this.coarseName = coarseName;
        this.students   = new String[100];
    }

    // Method that returns the name of the coarse
    public String getCoarseName() {

        return coarseName;
    }

    // Method that adds the name of the student that is enrolled in this coarse
    public void addStudent(String name) {

        students[numberOfStudents] = name;
        numberOfStudents++;
    }

    // Method that drops the student from the list of students enrolled
    public void dropStudent(String name) {
        int index;

        for (index = 0; index < numberOfStudents && !(students[index].equals(name)); index++);

        if (index < numberOfStudents) {
            for (int i = index; i < numberOfStudents; i++) {

                students[i] = students[i + 1];
            }
            System.out.println("Student Dropped.");
        }

        else
            System.out.println("Student Not Enrolled.");
    }

    // Method that returns the names of the students enrolled in the coarse
    public String[] getStudents() {

        return students;
    }

    // Method that returns the total number of students enrolled in the coarse
    public int getNumberOfStudents() {

        return numberOfStudents;
    }
}
