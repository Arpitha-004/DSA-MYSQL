class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        long cnt=0;
        int xr=0;
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            int x = xr^k;
            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }
            mpp.put(xr,mpp.getOrDefault(xr,0)+1);
        }
        return cnt;
    }
}