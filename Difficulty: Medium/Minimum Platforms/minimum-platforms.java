class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int N = arr.length;
        int i=0,j=0,cnt=0,max=0;
        
        while(i<N){
            if(arr[i]<=dep[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            max = Math.max(max,cnt);
        }
        return max;
    }
}
