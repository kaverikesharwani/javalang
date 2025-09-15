import java.util.*;
public class Palindrome{
    public static void myNum(int n){
        int myNum=n;
       int rev=0;
       while(n>0){
          int ld=n%10;
          rev=(rev*10)+ld;
          n=n/10;
       }
         if(myNum==rev){
            System.out.println(myNum  + " is palindrome");
         }
         else{System.out.println(myNum + " is not palindrome");
         }
    }
    public static void main(String args[]){
            myNum(1368741);
    }
}