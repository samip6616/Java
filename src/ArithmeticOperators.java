/*Arithmetic operators
These operators perform mathematical calculations.
Operator	        Meaning	          Example	    Result
    +	            Addition	        10 + 3	      13
    -	            Subtraction	      10 - 3	       7
    *	            Multiplication  	10 * 3	      30
    /	            Division	        10.0 / 3	   3.333…
    %	            Remainder	        10 % 3	       1
Important: integer division discards the fractional part. */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum); 

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division
        double quotient = (double) a / b; // Casting to double for accurate division
        System.out.println("Division: " + quotient);

        // Remainder
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
}
