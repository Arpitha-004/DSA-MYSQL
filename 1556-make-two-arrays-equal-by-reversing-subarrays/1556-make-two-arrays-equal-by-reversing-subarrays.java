class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int fre[] = new int[1001];
        for(int i=0;i<arr.length;i++){
            fre[target[i]]++;
            fre[arr[i]]--;
        }
        for(int f:fre)
            if(f != 0)
                return false;
        
        return true;
    }
}