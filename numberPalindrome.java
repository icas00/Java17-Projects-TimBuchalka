import java.util.*;
public class numberPalindrome {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(ispalindrome(number));
    }

    public static boolean ispalindrome(int number){
        int rev=0;//to find reverse fo the given number
        int temp = number;  //to store the original number
        while(temp>0){
            rev = rev*10 + temp%10;//dry run: assume temp = 121 , rev = 0*10 + 121%10(=1)=1 ,rev=1                   
            temp = temp/10;//temp=121/10=12.1(as temo is in int it ignores the decimal part) temp=12
                        //temp>0(1>0) continue loop
                        //rev =  1*10 + 12%10(=2) = 12,rev=12
                        //temp = 12/10=1.2(temp is in int it ignores the decimal part)temp=1
                        //temp>0(1>0) continue loop
                        //rev = 12*10 + 1%10(=1) = 121,rev=121
                        //temp = 1/10=0.1(temp is in int it ignores the decimal part)temp=0
                        //temp>0(0>0,false condition) break loop 
                        //final rev = 121
        }
        if(rev == number){//compare rev and number
            return true;
        }
        else
            return false;
    }

}