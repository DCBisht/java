import java.util.*;
public class PseduGramatic {
    static boolean pg(int n){
        int x=n;
        int m=0;
        while(x!=0)
        {
            
           
            int r=x%10;
            
             if(r==6)
            {
                r=9;
            }
            else if(r==9)
            {
                r=6;
            }
            else if(r==2||r==3||r==4||r==5||r==7)
            {
                System.out.println("Wrong input");
                return false;
                
            }
                m=m*10+r;
                x=x/10;
        }
        System.out.println("180 rotation is "+m);
        if(n==m)
        return true;
        else 
        return false;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    int n=sc.nextInt();
    sc.close();
    if(pg(n))
    System.out.println("Its a psedu gramatic NuMbeR");
    else
    System.out.println("Its not a psedu gramatic NuMbeR");
} 
}
