//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here TC = n*sqrt(n)
    /*    long sum = 0;
        for(int j=1;j<=N;j++){
            for(int i=1;i<=Math.sqrt(j);i++){
                if(j%i == 0)
                    sum+=i;
                    
                if(j/i != i)
                    sum+=j/i;
            }
        }
        
        return sum;
    */
        long sum=0;
        
        for(int i=1;i<=N;i++){
            sum+=i*(N/i);
        }
        return sum;
    }
}