import java.util.*;
public class alice_apple {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of trees in North South East West Direction");
        int N,S,W,E;
        N=sc.nextInt();
        S=sc.nextInt();
        W=sc.nextInt();
        E=sc.nextInt();
        System.out.println("Enter the value of K and M");
        int K=sc.nextInt();
        int M=sc.nextInt();
        int tot=N*0+S*K;
        if(W>=1)
        tot=tot+1;
        if(E>=1)
        tot=tot+1;
        if(tot>=M)
        System.out.println("Apple reqirements Fullfilled"+M);
        else 
        System.out.println("Apple reqirements not Fullfilled"+(-1));        
        sc.close();
    }
}
