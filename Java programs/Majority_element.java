import java.util.*;
public class Majority_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <N; i++) {
        a[i]=sc.nextInt();           
        }
        int g=0,c=0;
        int m=-1;
        for(int i=0;i<N;i++)
        {
            c=0;
            for (int j = 0; j <N; j++) {
                if(a[i]==a[j])
                c++;                
            }
            if(c>g)
            {
                g=c;
                m=i;
            }

        }
        System.out.println("Majority element is "+a[m]);
        if(g>(N/2))
        System.out.println("Condition satisfied");
        else
        System.out.println("Condition not satisfied");


        sc.close();

    }
}
