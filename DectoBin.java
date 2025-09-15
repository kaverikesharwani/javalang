import java.util.*;
public class DectoBin{
    public static void decNum(int n){
        int decNum=n;
        int pow=0;
        int BinNum=0;
        while(n>0){
            int rem=n%2;
            BinNum=BinNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2; 
        }
        System.out.println("binary of " + "n is = " + BinNum);
    }
   
    public static void main(String args[]){
        decNum(78);
    }
}