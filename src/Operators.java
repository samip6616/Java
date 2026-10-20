/*Write a program that:
1. Declares two integer variables, a = 15 and b = 4.
2. Prints their sum, difference, product, quotient, and remainder.
3. Checks whether a is greater than b.
4. Checks whether both numbers are positive using &&. */
public class Operators {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Are both numbers positive? " + (a > 0 && b > 0));
    }
}
