//The program will store a student's name, age, grade, marks, enrollment status, 
// and a constant for the passing mark.
public class StudentDetails {
    public static void main(String[] args) {

        // Student information
        String name = "Samip";
        int age = 20;
        char grade = 'A';
        double marks = 85.5;
        boolean isEnrolled = true;

        // Constant
        final int PASS_MARKS = 40;

        // Type casting
        int roundedMarks = (int) marks;

        // Print student details
        System.out.println("===== Student Details =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Marks as int: " + roundedMarks);
        System.out.println("Pass Mark: " + PASS_MARKS);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Passed: " + (marks >= PASS_MARKS));
    }
}
