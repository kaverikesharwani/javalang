import java.util.*;
public class Sumofdigit{
    public static void myDigit(int n){
        int myDigit=n;
        int rev=0;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            rev=(rev*10)+ld;
            n=n/10;
            
        }
           System.out.println(sum);
    }
    public static void main(String args[]){
               myDigit(2323356);
    }
}