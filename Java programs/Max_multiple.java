import java.util.*;
public class Max_multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of array");
        int N=sc.nextInt();
        int a[]=new int[N+1];
        System.out.println("Entr the elements of array");
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int m=1,g=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
        if(a[i]==0)
        {
            g=g>m?g:m;
            System.out.println(g);
            m=1;
        }
        else{
            m=m*a[i];
        }

    }
    g=g>m?g:m;
    System.out.println("Maximum multiplication is "+g);
}
}