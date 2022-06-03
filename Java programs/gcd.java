import java.util.*;
public class gcd {
    static int gcdf(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcdf(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
       System.out.println("Gcd is "+gcdf(a,b));
        sc.close();
    }
}
