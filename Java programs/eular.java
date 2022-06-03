import java.util.*;
public class eular {
static int gcd(int a, int b)
{
    if(a==0)
        return b;
    else
    return gcd(b%a,a);
}
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<n;i++)
            {
                if(gcd(i,n)==1)
                {
                    sum=sum+i;
                }
            }
            System.out.println("Sum ="+sum);
        
    }
}
