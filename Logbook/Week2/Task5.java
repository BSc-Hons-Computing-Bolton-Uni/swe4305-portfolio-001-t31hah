package Logbook.Week2;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize scanner

        System.out.print("Enter the number to see its multiplication table: ");

        // Ensure the input is a valid integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Loop to print the multiplication table
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " x " + number + " = " + (i * number));
            }
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close(); // Close the scanner only at the end
    }
}