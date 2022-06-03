// { Driver Code Starts
//Initial Template for Java
import java.io.*;
 
class pappu{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            long amount = Long.parseLong(read.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.findDiff(amount);
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long findDiff(long amount) 
    {
        // code here
        
        String a=String.valueOf(amount);
       a= a.replaceAll("6","9");
       long n= Long.valueOf(a);
       long sum= n-amount;
       return sum; 
       
            
       
    }
} 
