import java.util.*;
public class Reversearr{
    public static void Reverse(int arr[]){
        int first=0;int last=arr.length-1;

        while(first<last){
           int temp=arr[first];
           arr[first]=arr[last];
           arr[last]=temp;
           
         first++;
         last--;

        }
         
    }
    public static void main(String args[]){
        int arr[]={3,5,7,9,13,24,35};
        Reverse(arr);

        //print 
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
           System.out.println();
    }
}