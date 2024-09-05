class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el=-1;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt = 1;
                el = nums[i];
            }else if(el == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int fcnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                fcnt++;
            }
        }
        if(fcnt > nums.length/2)
            return el;

        return -1;
    }
}