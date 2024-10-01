class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE, n = nums.length;
        if(n==1)
            return nums[0];

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(sum>max)
                max=sum;

            if(i<n-1 && nums[i]>=nums[i+1])
                sum=0;
        }
        return max;
    }
}