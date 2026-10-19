public class StudentReport {
    public static void main(String[] args) {
        String name = "Samip";
        int age = 20;
        double gpa = 3.33;
        char section = 'A';
        boolean isPass = true;
        final double MAX_GPA = 4.0;
        int roundGPA = (int) gpa;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Section: " + section);
        System.out.println("Is Pass: " + isPass);
        System.out.println("MAX_GPA: " + MAX_GPA);
        System.out.println("Rounded GPA: " + roundGPA);
        System.out.println("Valid GPA: " + (gpa >= 0 && gpa <= MAX_GPA));
    }
}
