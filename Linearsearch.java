import java.util.*;
public class Linearsearch{
    public static int Numbers(int numbers[],int key){
        
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
                }
            }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={10,23,34,42,56,67,87};
        int key=76;
        int index=Numbers(numbers,key);
        if(index==-1){
         System.out.println("key not found");
        }
        else{
            System.out.println("required key is at index: "+ index);
        }
              
    }
}