import java.util.*;
public class equisum_equilibrium {
    static int sum(int a[]) 
    {
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s=s+a[i];
            
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <N; i++) {
        a[i]=sc.nextInt();           
        }
        sc.close();


    }
}
