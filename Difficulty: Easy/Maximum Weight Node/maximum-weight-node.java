// User function Template for Java

class Solution {
    public int maxWeightCell(int[] exits) {
        int N = exits.length;
        int[] temp = new int[N];
      
          
        for (int i = 0; i < N; i++) {
          
            if (exits[i] != -1) {
              
                temp[exits[i]] += i;
            }
        }
    
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (temp[i] > max || (temp[i] == max && i > ans)) {
                ans = i;
                max = temp[i];
            }
        }
        return ans;
    }
}