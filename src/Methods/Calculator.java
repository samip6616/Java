package Methods;
import java.util.Scanner;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
    return a + b + c;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Example of using the overloaded add method
        System.out.print("Enter third number for addition: ");
        double num3 = input.nextDouble();
        System.out.println("Addition with three numbers: " + add(num1, num2, num3));

        input.close();
    }
}
