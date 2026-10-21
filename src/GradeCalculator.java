import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks (0-100): ");
        double marks = input.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Enter a value from 0 to 100.");
        } else {
            char grade;
            String result;

            if (marks >= 80) {
                grade = 'A';
            } else if (marks >= 70) {
                grade = 'B';
            } else if (marks >= 60) {
                grade = 'C';
            } else if (marks >= 50) {
                grade = 'D';
            } else if (marks >= 40) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            // Nested condition
            if (marks >= 40) {
                result = "Pass";

                if (marks >= 80) {
                    System.out.println("Distinction achieved!");
                }
            } else {
                result = "Fail";
            }

            System.out.println("\n===== Student Grade Report =====");
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
            System.out.println("Result: " + result);
        }

        input.close();
    }
}
/*How the program works
1. Input: Scanner reads the student's name and marks.
2. Validation: marks < 0 || marks > 100 rejects marks outside the permitted range.
3. Grade selection: The if-else-if ladder assigns a letter grade.
4. Pass/fail: A nested condition checks whether the student passed and whether they achieved distinction.
5. Report: The program prints the final details.
The program uses double so decimal marks such as 79.5 are accepted. 
It does not yet handle non-numeric input such as typing "abc" for marks; that can be added later. */
