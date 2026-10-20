/*Logical operators
Logical operators combine or reverse Boolean conditions.
Operator    Meaning	        Example
    &&	    AND 	    age >= 18 && age <= 60
    ||	    OR 	        age < 18 || age > 60
    !	    NOT     	    !isPassed
Notice that Java uses short-circuit evaluation for && and ||: 
it may skip evaluating the second condition if the first already determines the result. */
public class LogicalOperators {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID); // true
        System.out.println(age < 18 || hasID);  // true
        System.out.println(!hasID);             // false
    }
}
