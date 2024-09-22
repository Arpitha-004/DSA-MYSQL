class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }else if(el1==nums[i]){
                cnt1++;
            }else if(el2==nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        int min = (int)(n/3)+1;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(el1==nums[i])
                cnt1++;
            else if(el2==nums[i])
                cnt2++;
        }
        if(cnt1>=min)
            lst.add(el1);
        if(cnt2>=min)
            lst.add(el2);

        Collections.sort(lst);
        return lst;
    }
}