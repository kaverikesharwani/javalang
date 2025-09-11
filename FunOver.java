import java.util.*;
public class FunOver{

    //sum of 2 integers
    public static int sum(int a,int b){
        return a+b;
    }

    //sum of 2 double values
    public static double sum(double a,double b){
        return a+b;
    }

    //sum of 3 float values
    public static float sum(float a,float b,float c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(4.6,7.8));
        System.out.println(sum(4.6f,7.8f,6.7f));

    }
}