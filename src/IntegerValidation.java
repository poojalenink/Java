import java.util.Scanner;

public class IntegerValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        // Keep asking until a valid integer is entered
        while (true) {

            System.out.print("Enter an integer: ");

            // Check whether the input is an integer
            if (scanner.hasNextInt()) {

                number = scanner.nextInt();

                // Valid input, exit loop
                break;

            } else {

                // Invalid input message
                System.out.println(
                        "Invalid input! Please enter a valid integer."
                );

                // Consume the invalid token
                scanner.next();
            }
        }

        System.out.println("You entered: " + number);

        scanner.close();
    }
}