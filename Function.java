public class Function{
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        int a=4;
        int b=5;
        int prod=multiply(a,b);
        System.out.println(prod);
        prod=multiply(30,47);
        System.out.println(prod);
    }
}