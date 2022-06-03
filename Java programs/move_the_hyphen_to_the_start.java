import java.util.*;
public class move_the_hyphen_to_the_start {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),ns="",sub="";
        sc.close();
        // int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='-')
            {
                // c++;
                sub=sub+'-';
            }
            else
            ns=ns+s.charAt(i);
        }
       
            ns=sub+ns;
        
        System.out.println("The new string s is "+ns);
    
 }   
}
