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
        System.out.print("Enter your letter grade (A, B, C, D, E, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        String classification = switch (grade) {
            case 'A' -> "1st";
            case 'B' -> "2:1";
            case 'C' -> "2:2";
            case 'D' -> "3rd";
            case 'E' -> "Ordinary";
            case 'F' -> "Fail";
            default -> "Invalid grade entered";
        };

        System.out.println("Your classification: " + classification);
        scanner.close();

        // Q3 Output the digits between the range of 0 to 9 using a loop.
        System.out.println("Using a for loop:");
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " "); // Print each digit followed by a space
        }
        System.out.println(); // Add a newline at the end

        // Using a while loop (alternative)
        System.out.println("\nUsing a while loop:");
        int j = 0;
        while (j <= 9) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Using a do-while loop (less common for this specific case)
        System.out.println("\nUsing a do-while loop:");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 9);
        System.out.println();

        // Q4
        // Print the seven times multiplication table
        System.out.println("Seven times multiplication table:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x 7 = " + (i * 7));
        }
        System.out.print("Enter the number to see its multiplication table: ");


        scanner.close(); // Close the scanner only at the end
    }
}