import java.util.*;
public class Invertedpy{
    public static void myNum(int n){
        int i;
        int j;
        //outer

        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
          myNum(6);
    }
}