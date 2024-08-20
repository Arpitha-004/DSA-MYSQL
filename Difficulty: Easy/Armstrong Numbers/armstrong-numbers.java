//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int num = n;
        int sum = 0;
        int k = String.valueOf(n).length();
        
        while(n > 0){
            int ld = n % 10;
           
            sum = sum + (int)Math.pow(ld,k);
            
            n = n / 10;
        }
        return sum == num ? "true" : "false";
    }
}