public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        // Check if the input is invalid (negative)
        if (kilometersPerHour < 0) {
            return -1; // Return -1 for invalid input
        }
        
        // Perform the conversion from km/h to mi/h
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        // Check if the input is invalid (negative)
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value"); // Print error message for invalid input
        } else {
            // Get the miles per hour conversion and print the result
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(String.format("%.2f km/h = %d mi/h", kilometersPerHour, milesPerHour));
        }
    }
}
