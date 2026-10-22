public class ScopeExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            int bonus = 2;
            System.out.println(number);
            System.out.println(bonus);
        }

        System.out.println(number);
        // System.out.println(bonus); // Error
    }
}
