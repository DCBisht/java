//
import java.util.*;
public class Leaders_in_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int N=sc.nextInt();
        int a[]=new int[N+1];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <N; i++) {
        a[i]=sc.nextInt();           
        }
        a[N]=Integer.MIN_VALUE;
        System.out.println("Leaders in the given Array is");
        for (int i = 0; i < N; i++) {
            
            if(a[i]>a[i+1])
            System.out.print(a[i]+" ");
            
        }
        sc.close();
    }
}
