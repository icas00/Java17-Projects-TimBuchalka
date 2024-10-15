
public class leap_year_cal {
     public static boolean isLeapyear(int year){
        if (year>=1 || year<=9999){
            if (year%4==0) {//year is divible by 4
                if (year%100!=0){//year is not divisible by 100 and but divisible by 4
                    System.out.println("Year "+year+" is a leap year");
                }else if (year%400==0){//year is not divisible by 100 but divisible by 400 and 4
                    System.out.println("Year "+year+" is a leap year");
                }                   
            }else // year is not diisible by 4
                return false;            
        } 
        return false;
     }

     public static void main(String args[]){
        isLeapyear(2004);
     }
}
