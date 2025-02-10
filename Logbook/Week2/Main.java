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

        //Write a program that enables a student to enter a letter grade (A, B, C, D, E or F), then convert that to auniversity undergraduate classification (1st, 2:1, 2:2, 3rd, ordinary, fail).
        // Prompt user for input
        System.out.print("Enter your letter grade (A, B, C, D, E or F): ");
        String grade = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        // Convert grade to classification
        String classification;

        switch (grade) {
            case "A":
                classification = "1st (First Class Honours)";
                break;
            case "B":
                classification = "2:1 (Upper Second Class Honours)";
                break;
            case "C":
                classification = "2:2 (Lower Second Class Honours)";
                break;
            case "D":
                classification = "3rd (Third Class Honours)";
                break;
            case "E":
                classification = "Ordinary Degree (Pass)";
                break;
            case "F":
                classification = "Fail";
                break;
            default:
                classification = "Invalid grade entered";
                break;
        }

        // Display result
        System.out.println("Your degree classification is: " + classification);


        // Close the scanner
        scanner.close();
    }
}
