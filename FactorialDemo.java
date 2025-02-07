import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number to find its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial of a negative number is not defined.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            int factorial = 1;

            // Calculate factorial using a loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i; // Multiply current value of factorial by i
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
