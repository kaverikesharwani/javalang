import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println(n +  "is prime");
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){
                isPrime=false;
             }
        }
        if (isPrime==false){
            System.out.println(n + " is not prime number");
        }
        else{System.out.println(n + " is prime number");
        }
        
        }
    }
}