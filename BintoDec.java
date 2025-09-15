import java.util.*;
public class BintoDec{
public static void decNum(int n){
    int myNum=n;
    int pow=0;
    int decNum=0;
 while(n>0){
    int ld=n%10;
    decNum=decNum+(ld*(int)Math.pow(2,pow));
    pow++;
     n=n/10;
  }
  System.out.println("decimal of" + " myNum = " + decNum);

  }
     public static void main(String args[]){
           decNum(101111);
    }

}
    