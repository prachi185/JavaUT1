import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Handle the case where n is less than or equal to 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;  // Exit the program if the input is invalid
        }

        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to display the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Update the terms for the next iteration
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
