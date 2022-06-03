import java.util.*;
public class group_activity {
    static boolean cheak(int n,int u,int l)
    {
        if(n<=u&&n>=l)
        {
            return true;
        }
        else
        {return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            
        }
        Arrays.sort(a);
        boolean flag=true;
        int c=0;
        int l=a.length;
        while(flag && l-->0)
        {
            if(a[1]>1)
            flag=false;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        sc.close();


    }
}
