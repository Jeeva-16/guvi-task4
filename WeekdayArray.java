import java.util.Scanner;

public class WeekdayArray {
    public static void main(String[] args) {
        // Define the array of weekdays starting with "Sunday" at index 0
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a day position
        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();

        // Handle the array index out of bound exception
        try {
            // Print the day name based on the user's input
            if (dayPosition >= 0 && dayPosition < weekdays.length) {
                System.out.println("The day at position " + dayPosition + " is " + weekdays[dayPosition] + ".");
            } else {
                // Print an error message if the index is out of bounds
                System.out.println("Error: Day position must be between 0 and 6.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bound exception
            System.out.println("Error: Invalid day position.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

}
