public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(123456);
    }
    public static  int getEvenDigitSum(int number){
        if (number<0){
            System.out.println("Invalid Value");
            return -1;
        }
        int sum=0;
       while(number>1){
        int remainder=number%10;
        if(remainder%2==0){
            sum+=remainder;
            number = number/10;
        }
        else
            number=number/10;
       }  
       System.out.println(sum);
       return 1;      
    }
}
