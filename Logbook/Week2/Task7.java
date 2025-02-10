package Logbook.Week2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueGrading;

        do {
            System.out.print("Enter your exam mark (0-100): ");

            if (scanner.hasNextInt()) {
                int mark = scanner.nextInt();

                if (mark >= 0 && mark <= 100) {
                    char grade = calculateGrade(mark);
                    System.out.println("Your grade: " + grade);
                } else {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer mark.");
                scanner.next(); // Consume invalid input
            }

            System.out.print("Do you want to enter another grade (y/n)? ");
            continueGrading = scanner.next().toLowerCase().charAt(0);

        } while (continueGrading == 'y');

        System.out.println("Goodbye!");
        scanner.close();
    }

    public static char calculateGrade(int mark) {
        if (mark >= 70) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}