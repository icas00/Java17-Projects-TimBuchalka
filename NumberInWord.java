import java.util.*;
public class NumberInWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        printNumberInWord(a);
    }
     public static void printNumberInWord(int number){
        if(number<0 || number>9)
            System.out.println("Invalid number");
        String num=switch(number){
            case 0->"Zero";
            case 1->"One";
            case 2->"Two";
            case 3->"Three";
            case 4->"Four";
            case 5->"Five";
            case 6->"Six";
            case 7->"Seven";
            case 8->"Eight";
            case 9->"Nine";
            default->"Invalid number";
        };
        System.out.println(num);
     }
}
