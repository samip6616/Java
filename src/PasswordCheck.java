import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = input.nextLine();
        }

        System.out.println("Access granted!");

        input.close();
    }
}
