import java.util.*;
public class BinCoeff{

public static int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
        
    }
    return f;
}
public static int binomialC(int n,int r){
    int a=fact(n);
    int b=fact(r);
    int c=fact(n-r);
    int binC=a/(b*c);
    return binC;


}

    public static void main(String args[]){
        
          System.out.println(fact(6));
          System.out.println(binomialC(6,3));
    }
}