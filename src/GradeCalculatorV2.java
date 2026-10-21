import java.util.Scanner;
/* Additional features
Ask the user for marks in three subjects.
Calculate the average.
Validate that each mark is between 0 and 100.
Assign a grade using an if-else-if ladder.
Use a nested condition to determine whether the student passed all three subjects.
Print the student's name, average, grade, and final result. */
public class GradeCalculatorV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Subject marks
        System.out.print("Enter marks for Subject 1 (0-100): ");
        double sub1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2 (0-100): ");
        double sub2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3 (0-100): ");
        double sub3 = input.nextDouble();

        // Validation
        if (sub1 < 0 || sub1 > 100 ||
            sub2 < 0 || sub2 > 100 ||
            sub3 < 0 || sub3 > 100) {

            System.out.println("Invalid marks! All marks must be between 0 and 100.");

        } else {

            // Calculate average
            double average = (sub1 + sub2 + sub3) / 3;

            // Grade assignment using if-else-if ladder
            char grade;

            if (average >= 80) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else if (average >= 60) {
                grade = 'C';
            } else if (average >= 50) {
                grade = 'D';
            } else if (average >= 40) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            String result;

            // Nested condition to check passing all subjects
            if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
                result = "Pass";

                if (average >= 80) {
                    System.out.println("Distinction achieved!");
                }
            } else {
                result = "Fail";
            }

            // Report
            System.out.println("\n===== Student Grade Report =====");
            System.out.println("Name: " + name);
            System.out.println("Subject 1 Marks: " + sub1);
            System.out.println("Subject 2 Marks: " + sub2);
            System.out.println("Subject 3 Marks: " + sub3);
            System.out.printf("Average Marks: %.2f%n", average);
            System.out.println("Grade: " + grade);
            System.out.println("Result: " + result);
        }

        input.close();
    }
}
