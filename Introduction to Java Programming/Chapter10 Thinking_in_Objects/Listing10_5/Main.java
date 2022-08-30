// Problem taken from Introduction to Java Programming by Y. Daniel Liang (8th ed.)
// Thinking in Objects
//
// Listing 10.5 : Write an object that represents a course.
//                Write a program that allows users to benefit from this coarse
//                object, allowing them to set coarse name, add and drop students,
//                get the total number of students, and all the names of the students
//                enrolled in this coarse.
//
//
// Author : Giorgio Murad

class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Jobs");

        String[] students = course1.getStudents();
        System.out.println("Number of students of course 1: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i]);

        System.out.println();

        String[] students2 = course2.getStudents();
        System.out.println("Number of students of course 2: " + course2.getNumberOfStudents());
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.println(students2[i]);
    }
}