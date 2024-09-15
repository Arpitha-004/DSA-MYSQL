//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            long arr[] = new long[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long merge(long arr[], int l, int m, int r)
    {
         // Your code here
        ArrayList<Long> temp = new ArrayList<>();
        
        int left = l;
        int right = m + 1;
        long cnt=0;
        
        while(left <= m && right <= r){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt+=(m-left+1);
                right++;
            }
        }
        
        while(left <= m){
            temp.add(arr[left]);
            left++;
        }
        while(right <= r){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=l;i<=r;i++){
            arr[i] = temp.get(i - l);
        }
        return cnt;
        
    }
    static long mergeSort(long arr[], int l, int r)
    {
        //code here
        long cnt=0;
        if(l >= r)
            return cnt;
            
        int m = (l + r)/2;
        cnt += mergeSort(arr,l,m);
        cnt += mergeSort(arr,m+1,r);
        
        cnt += merge(arr,l,m,r);
        return cnt;
    }
    static long inversionCount(long arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
    }
}