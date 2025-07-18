class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        // int start=-1,end=-1,s=-1;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            // if(sum==0){
            //     s=i;
            // }
            if(sum>maxi){
                maxi = sum;
                // start=s;
                // end=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        // for(int i=start;i<=end;i++)
        //     System.out.print(nums[i]+" ");

        return maxi;
    }
}