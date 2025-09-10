import java.util.*;
public class Bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pen=sc.nextInt();
        int p=sc.nextInt();
        int er=sc.nextInt();
        int bill=pen+p+er;
        int total=(int)(.18*bill);
        System.out.println(total+bill);
    }
}

