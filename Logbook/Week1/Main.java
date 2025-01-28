package Logbook.Week1;

import java.util.Scanner; // Import Scanner to take user input

public class Main {
    public static void main(String[] args) {
        // Print "Hello World!" (Original Code)
        System.out.println("Hello World!");

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Store the name in a variable

        // Print a personalized greeting
        System.out.println("Hello " + name + "!");

        double length, height;

        // Get length from user
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        // Get height from user
        System.out.print("Enter the height of the rectangle: ");
        height = scanner.nextDouble();

        // Calculate perimeter and area
        double perimeter = 2 * (length + height);
        double area = length * height;

        // Display results
        System.out.println("\nRectangle Calculations:");
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        // Declare variables
        double number1, number2, average;

        // Get first number
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        // Get second number
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        // Calculate average
        average = (number1 + number2) / 2;

        // Display result with 2 decimal places
        System.out.printf("\nThe average of %.2f and %.2f is: %.2f%n",
                number1, number2, average);

        scanner.close(); // Close the scanner (Good practice)
    }
}