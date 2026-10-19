public class VarAndDTypes {
    char symbol = '#'; //A Java char represents one UTF-16 code unit, not necessarily one complete Unicode character. Range: 0 to 65,535
    String name = "Samip";  //Stores a sequence of characters. String is a class, not a primitive type. Range: 0 to 65,535
    int myage = 20;  //Range: -2,147,483,648 to 2,147,483,647
    double grade = 85.5;  //Range: 4.9e-324 to 1.8e+308
    boolean isEnrolled = true; //Useful for conditions and status values.
    /*
    Type casting in Java
    Type casting means converting a value from one data type to another.

    There are two main types.
    A. Widening casting (automatic)
    Java automatically converts a smaller-range numeric type to a compatible wider type.

    B. Narrowing casting (manual)
    Converting a wider numeric type to a narrower one may lose information. You must explicitly cast it.
    The decimal part is discarded; the value is not rounded.
    You can also cast a double to an int with negative values. For example, (int) -3.9 produces -3, not -4.

    C. Converting text into numbers
    Casting is not the same as parsing a string.
    Use Integer.parseInt() for integer text and Double.parseDouble() for decimal text. 
    Invalid numeric text can cause a NumberFormatException.

     */
    int number = 10;
    double result = number;
    double price = 99.99;
    int wholePrice = (int) price;

    String ageText = "21";
    int age = Integer.parseInt(ageText);

    String marksText = "85.5";
    double marks = Double.parseDouble(marksText);

    /*Constants in Java
    A constant is a value that cannot be reassigned after initialization. 
    Java uses the "final" keyword to declare a variable that cannot be reassigned. 
    By convention, constants use uppercase names with underscores between words, such as MAX_MARKS or PASS_MARKS.

    Note that final prevents reassignment of the variable; for an object, it does not automatically make the object's 
    contents immutable.*/

    final double PI = 3.14159;
    final int PASS_MARKS = 40;
    final int MAX_MARKS = 100;


    public void main(String[] args) {
    System.out.println("result: " + result);
    System.out.println("wholePrice: " + wholePrice);
    System.out.println("age: " + age);
    System.out.println("marks: " + marks);
    System.out.println("PASS_MARKS: " + PASS_MARKS);
    System.out.println("MAX_MARKS: " + MAX_MARKS);
}
}
