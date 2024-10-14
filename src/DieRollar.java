import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random random = new Random(); // To generate random numbers
        Scanner scanner = new Scanner(System.in); //

        boolean continueRolling = true; // for the main loop

        // Outer loop for multiple rounds
        for (; continueRolling; ) {
            // Print table header
            System.out.printf("%-4s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount; // Counter for the number of rolls

            // Inner loop for rolling dice
            for (rollCount = 1; rollCount <= 3; rollCount++) {
                // Generate random values for the dice
                int die1 = random.nextInt(6) + 1; // Roll for Die1 (1-6)
                int die2 = random.nextInt(6) + 1; // Roll for Die2 (1-6)
                int die3 = random.nextInt(6) + 1; // Roll for Die3 (1-6)

                // Calculate the sum of the dice
                int sum = die1 + die2 + die3;

                // Print the results in a formatted table
                System.out.printf("%-4d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                // Check if all three dice have the same value (triple)
                if (die1 == die2 && die2 == die3) {
                    System.out.println("Congratulations! You rolled a triple!");
                    break; // Exit the loop if a triple is rolled
                }
            }

            // Ask the user if they want to roll again
            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            continueRolling = response.equals("yes"); //
        }


        System.out.println("Thanks for playing!"); // Exit message
    }
}
