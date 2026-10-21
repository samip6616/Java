import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        String operation = input.next();

        System.out.println("\n===== Calculator =====");
        switch (operation) {
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
        }

        input.close();
    }
}
/*How the calculator works
1. import java.util.Scanner; makes the Scanner class available.
2. new Scanner(System.in) prepares the program to read keyboard input.
3. nextDouble() reads each number.
4. Arithmetic operators perform the calculations.
5. The switch statement performs only the operation selected by the user.
6. The division case checks that the second number is not zero.
7. input.close() closes the scanner when input is no longer needed. */
