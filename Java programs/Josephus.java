import java.util.*;
public class Josephus
{
    static int J(int n,int k)
    {
        
        if(n==1)
        return 1;
        else
        {
            int k1=(J(n-1,k)+k-1)%n+1;
            System.out.println(k1);
            return k1;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("Safe place is "+J(n,k));
        sc.close();
    }
}