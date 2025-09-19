import java.util.*;
public class Binarysearch{
 public static int Binary(int numbers[],int tar){
    int st=0,end=numbers.length-1;
    
    while(st<=end){
        int mid=st+(end-st)/2;
        if(tar>numbers[mid]){
            st=mid+1;
        }
        else if(tar<numbers[mid]){
            end=mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
 }

    public static void main(String args[]){
        int numbers[]={10,13,14,34,56,78,79,89};
        int tar=69;
       System.out.println("index of " + tar + " is : " + Binary(numbers,tar));

    } 

}