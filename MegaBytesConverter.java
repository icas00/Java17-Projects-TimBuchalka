import java.util.Scanner;

public class MegaBytesConverter {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a value for kilobytes
        System.out.print("Enter the number of kilobytes: ");
        int kiloBytes = scanner.nextInt(); // Read user input

        // Call the conversion method to print the result
        printMegaBytesAndKiloBytes(kiloBytes);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Check if the input is invalid (negative)
        if (kiloBytes < 0) {
            System.out.println("Invalid Value"); // Print error message for invalid input
            return; // Exit the method if the value is invalid
        }

        // Calculate megabytes (1 MB = 1024 KB)
        int megabytes = kiloBytes / 1024;
        // Calculate remaining kilobytes
        int remainingKiloBytes = kiloBytes % 1024;

        // Print the result in the format "XX KB = YY MB and ZZ KB"
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
    }
}
