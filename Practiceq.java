import java.util.*;
public class Practiceq{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
         }
    }
    public static void main(String args[]){
        boolean result=isEven(24);
        System.out.println(result);

        // main method to test isEven

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number : " );
        int n=sc.nextInt();

        if(isEven(n)){
            System.out.println("even");

        }else{
            System.out.println("odd");
        }



}
}