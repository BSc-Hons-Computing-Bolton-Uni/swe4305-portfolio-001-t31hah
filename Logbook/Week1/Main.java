package Logbook.Week1;

import java.util.Scanner; // Import Scanner to take user input
import java.time.Year; // Import Year to get the current year

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

        // Declare variables for the two numbers
        int firstNumber, secondNumber;

        // Get first number
        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        // Get second number
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        // Display original order
        System.out.println("\nOriginal Order:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Display reversed order
        System.out.println("\nReversed Order:");
        System.out.println("First number: " + secondNumber);
        System.out.println("Second number: " + firstNumber);

        //Q6 Birthday
        // Get the current year
        int currentYear = Year.now().getValue();

        // Allow the user to type in their age, calculate, and output their estimated birth year.
        // Declare variable for age
        int age;

        // Get age from user
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        // Calculate birth year
        int birthYear = currentYear - age;

        // Display result
        System.out.println("\nBased on your age of " + age + ":");
        System.out.println("You were most likely born in " + birthYear);
        System.out.println("(Note: This is estimately depending on whether you've had your birthday this year)");

        // Q8 Conversion from feet to miles
        final int FEET_PER_MILE = 5280; // Define feet per mile as a constant

        // Ask the user for the number of feet
        System.out.print("Enter the number of feet: ");
        double feet = scanner.nextDouble();

        // Convert feet to miles
        double miles = feet / FEET_PER_MILE;

        // Display the result
        System.out.printf("\n%.2f feet is equal to %.4f miles.%n", feet, miles);

        // Q9 Interest Calculation
        final double INTEREST_RATE = 0.01; // 1% interest rate

        // Ask the user for the deposit amount
        System.out.print("Enter the deposit amount: ");
        double deposit = scanner.nextDouble();

        // Calculate interest and total amount
        double interest = deposit * INTEREST_RATE;
        double totalAmount = deposit + interest;

        // Display the result
        System.out.printf("\nWith a deposit of %.2f, you will earn %.2f in interest. Total amount after one year: %.2f%n", deposit, interest, totalAmount);

        scanner.close(); // Close the scanner to free underlying resources (Good practice)
    }
}