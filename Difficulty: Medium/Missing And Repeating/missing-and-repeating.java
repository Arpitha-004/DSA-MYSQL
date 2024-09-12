//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        long SN = (long)n*(n+1)/2;
        long S2N = (long)n*(n+1)*(2*n+1)/6;
        long S=0,S2=0;
        
        for(int i=0;i<n;i++){
            S += arr[i];
            S2 += (long)arr[i] * arr[i];
        }
        long val1 = S - SN;  //B-A=val1  --->1 , B repeated A missing
        long val2 = S2 - S2N;    //B^2-A^2=val2 => (B+A)(B-A)
        val2 = val2 / val1;     //B+A=val2  --->2
        
        long B = (val1 + val2)/2;    //2B=val1+val2
        long A = B - val1;   //from 1, A=B-val1
        
        return new int[]{(int)B,(int)A};
    }
}