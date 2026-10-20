/*Comparison operators
Comparison operators compare two values and return a boolean (true or false).
Operator	        Meaning	                Example
    ==	        Equal to	                5 == 5 → true
    !=	        Not equal to	            5 != 3 → true
    >	          Greater than	            8 > 4 → true
    <	          Less than	                2 < 7 → true
    >=	        Greater than or equal to	5 >= 5 → true
    <=	        Less than or equal to	    3 <= 2 → false */
public class ComparisonOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        // Equal to
        boolean isEqual = (x == y);
        System.out.println("Equal to: " + isEqual); // false

        // Not equal to
        boolean isNotEqual = (x != y);
        System.out.println("Not equal to: " + isNotEqual); // true

        // Greater than
        boolean isGreaterThan = (x > y);
        System.out.println("Greater than: " + isGreaterThan); // true

        // Less than
        boolean isLessThan = (x < y);
        System.out.println("Less than: " + isLessThan); // false

        // Greater than or equal to
        boolean isGreaterThanOrEqualTo = (x >= y);
        System.out.println("Greater than or equal to: " + isGreaterThanOrEqualTo); // true

        // Less than or equal to
        boolean isLessThanOrEqualTo = (x <= y);
        System.out.println("Less than or equal to: " + isLessThanOrEqualTo); // false
    }
}
