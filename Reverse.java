import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        while(i>0){
            int lastDigit=i%10;
            System.out.print(lastDigit);
            i=i/10;
        }
        System.out.println();
    }

}