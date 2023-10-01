import java.util.ArrayList;

public class Course {
    private String courseName;      // Name of the course
    ArrayList<String> students;     // List of students enrolled in the course
    int nbOfStudents;               // Number of students taking the course


    // Constructor that creates a course with the specified name
    public Course(String courseName) {

        this.courseName = courseName;
        students = new ArrayList<String>();
        nbOfStudents = 0;
    }


    // Method that returns the name of the course
    public String getCourseName() {

        return courseName;
    }

    // Method that adds a new student to the course
    public void addStudent(String student) {

        students.add(student);
    }

    // Method that drops the student from the course
    public void dropStudent(String student) {

        if (students.contains(student))
            students.remove(student);

        else
            System.out.println("Student name is not in the list");
    }

    // Method that returns the list of students
    public String[] getStudents() {

        return (String[]) students.toArray();
    }

    // Method that returns the number of students enrolled in the course
    public int getNbOfStudents() {

        return nbOfStudents;
    }
}
