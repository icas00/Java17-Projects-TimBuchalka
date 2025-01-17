public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(9, 99);
    }
    public static boolean  hasSharedDigit(int num1,int num2){
        if ((num1>=10 && num1<=99) && (num2>=10 && num2<=99)) {
           int remainderNum11=num1%10;//10->0
           int remainderNum21=num2%10;//99->9

           num1=num1/10;//10->1
           num2=num2/10;///99->9.9->9

           int remainderNum12=num1%10;//1->1
           int remainderNum22=num2%10;//9->9
            
           if (remainderNum11==remainderNum21){
                System.out.println( "shared digit: " + remainderNum11);
                return true;
            }
            else if (remainderNum11==remainderNum22){
            System.out.println("shared digit: " + remainderNum11);
            return true;
            }
            else if (remainderNum12==remainderNum21){
                System.out.println("shared digit: " + remainderNum12);
                return true;
           }
           else if(remainderNum12==remainderNum22){
            System.out.println("shared digit: " + remainderNum12);
            return true;
            }
            else{
                System.out.println("No Shared Digit");
            }       
        }
        System.out.println("Invalid Input");
        return false;
    }
}