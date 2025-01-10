public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.println("Invalid Value");
        long days =minutes / 60 /24;//60min in 1h, 24h in 1 day
        long years = days / 365;//365 days in 1 year
        long remainingDays = days % 365;
        System.out.println(minutes + "min = "+ years +"y and "+ remainingDays +"d");
    }
}
