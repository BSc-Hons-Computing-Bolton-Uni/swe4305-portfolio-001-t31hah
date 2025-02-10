package Logbook.Week2;

import java.util.Scanner;
//Extend exercise 6 from Week 1 to output a message if the user is 18 or older.
class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the current year
        int currentYear = 2025;

        // Ask user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Calculate birth year
        int birthYear = currentYear - age;

        // Display the birth year
        System.out.println("You were born in " + birthYear);

        // Check if user is 18 or older
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are under 18.");
        }

        // Close the scanner
        scanner.close();
    }
}
