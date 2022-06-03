import java.util.*;
public class booths_algortihm {
    static String bin(int x,int n)
    {
        if(x<0)
        {
        x=x*-1;
        }
        String b=Integer.toBinaryString(x);
        while(b.length()<=n-1)
        {
            b='0'+b;
        }
        System.out.println("B value is "+b);
        return b;
    }
    static String nbin(String s)
    {
        String ns="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            ns=ns+'1';
            else{
                ns=ns+'0';
            }

        }
        String rs="";
        if(ns.charAt(ns.length()-1)=='0')
        rs=ns.substring(0,s.length()-1)+'1';
        else
        rs=ns.substring(0,s.length()-1)+'0';
        
        System.out.println("Negativ eindex is "+ns);
        return ns;
    }
    static String binadd(String s1,String s2)
    {
        String s3="";
        
        return s3;
    }
    public static void main(String ars[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter M,Q,N");
        int m=sc.nextInt();
        int q=sc.nextInt();
        int n=sc.nextInt();
        String pm=bin(m,n);
        String nm=nbin(pm);
        String bq=bin(q,n);
        String q0="0",mul="";
        String a="";
        for(int i=0;i<n;i++)
        {
            a=a+'0';
        }
        while(n!=0)
        {
            if((bq.charAt(bq.length()-1)+q0)=="10")
            {
                //a=binadd(a,pm);
        }
        else if((bq.charAt(bq.length()-1)+q0)=="11")
        {
           // a=binadd(a,nm);
        }
           // rightshift(a+bq+q0);
            n--;

        }

        sc.close();

        
    }
}
