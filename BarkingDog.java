import java.util.Scanner;

public class BarkingDog {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for barking status and hour of the day
        System.out.print("Is the dog barking (true/false)? ");
        boolean barking = scanner.nextBoolean(); // Read user input for barking status

        System.out.print("Enter the hour of the day (0-23): ");
        int hourOfDay = scanner.nextInt(); // Read user input for hour of the day

        // Call the shouldWakeUp method to check if you should wake up
        boolean wakeUp = shouldWakeUp(barking, hourOfDay);

        // Output the result
        if (wakeUp) {
            System.out.println("You should wake up!");
        } else {
            System.out.println("You can sleep peacefully.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // Check if the hour is invalid (less than 0 or greater than 23)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Invalid hour, so no need to wake up
        }
        // If the dog is barking and it's either before 8am or after 10pm, you should wake up
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
