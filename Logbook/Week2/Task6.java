package Logbook.Week2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char restart;

        do {
            System.out.print("Enter the number to see its multiplication table: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                for (int i = 1; i <= 12; i++) {
                    System.out.println(i + " x " + number + " = " + (i * number));
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }

            System.out.print("Do you want to see another multiplication table (y/n)? ");
            restart = scanner.next().toLowerCase().charAt(0); // Get the first char, lowercase

        } while (restart == 'y');

        System.out.println("Goodbye!");
        scanner.close();
    }
}