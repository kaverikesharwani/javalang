import java.util.*;
public class Pythagoreantriplet{
    public static void Pythagorean(int a,int b,int c){
        int max=a;
        if(b>=max){
             max=b;
        }
        if(c>=max){
             max=c;
        }
        
        if(max==a){
            boolean flag=(b*b+c*c==a*a);
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=(a*a+c*c==b*b);
            System.out.println(flag);
        }
        else{
            boolean flag=(b*b+a*a==c*c);
            System.out.println(flag);
        }
    }  
    public static void main(String args[]){
          Pythagorean(3,4,5);
    }
}