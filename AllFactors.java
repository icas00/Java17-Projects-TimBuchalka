public class AllFactors {
    public static void main(String args[]){
        printFactors(10);
    }

    public static void printFactors(int number){
        if (number<1){
            System.out.println("Invalid value");
        }
        else{
            int num=1;
            while(num<=number){
                if (number%num==0){
                    System.out.println(num);
                    num+=1;
                }
                else{
                    num+=1;
                }
            }
        }
    }
}
