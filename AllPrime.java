import java.util.*;
public class AllPrime{
public static boolean isPrime(int n){

  //print range of prime numbers from 2 to n

    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
            
        }
        
    }
    return true;
}

public static void AllPrimes(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
    
    System.out.println();
}

    public static void main(String args[]){
     AllPrimes(2345);
    }
}