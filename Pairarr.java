import java.util.*;
public class Pairarr{
    public static void Pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
             int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr  + " , " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
            }

            // print total no. of pairs=n(n-1)/2

            System.out.println("total no. of pairs are:" + tp);
    }
    public static void main(String args[]){
        int arr[]={3,5,7,9,11,45,67,32,4,36};
        Pair(arr);
    }
}