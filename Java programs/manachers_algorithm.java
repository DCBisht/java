import java.util.*;
public class manachers_algorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to be cheaked");
        String s=sc.nextLine();
        sc.close();
        boolean f=true;
        int n=s.length();
        int v=0;
        if(s.length()%2==0)
        {
            v=1;
        }
        for(int i=0;i<=s.length()/2;i++)
        {
            if(s.charAt(n/2+i)!=s.charAt(n/2-v-i))
            {
              System.out.println("Not palindrome word"); 
              f=false;
              break; 
            }
        }
        
        
       
        if(f)
        {
            System.out.println("Palindrome word"); 
        }
    }
}
