
import java.util.*;
public class sod {
    static boolean fi(int n)
    {
        if(n%15==0)
            return true;
        return false;
    }
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m =sc.nextInt();
        int n =sc.nextInt();
        sc.close();
        int s=0;
        while(!fi(m))
        {
            m++;
        }
        for(int i=m;i<=n;i+=15){
            s=s+i;
        }
        System.out.println("Sum ="+s);
    }
}
