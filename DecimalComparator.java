public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long Round1 = (long) (num1 * 1000);
        long Round2 = (long) (num2 * 1000);
        if (Round1 == Round2){
            System.out.println("Equal");
            return true;
        }else{
            System.out.println("Not Equal");
            return false;}

    }

    public static void main(String[] args){
        areEqualByThreeDecimalPlaces(14.325, 14.3221);
    }
}
