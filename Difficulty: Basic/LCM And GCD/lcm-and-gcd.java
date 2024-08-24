//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ar = new Long[2];
        Long n1=A,n2=B;
        while(A>0 && B>0){
            if(A>B) A=A%B;
            else B=B%A;
        }
        if(A==0){
            ar[0] = (n1*n2)/B;
            ar[1] = B;
        }else{
            ar[0] = (n1*n2)/A;
            ar[1] = A;
        } 
        return ar;
    }
}