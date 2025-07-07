class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int l=0,r=0;
        Map<Character,Integer> mpp = new HashMap<>();
        while(r < s.length()){
            if(mpp.containsKey(s.charAt(r)))
                l = Math.max(l,mpp.get(s.charAt(r))+1);

                mpp.put(s.charAt(r),r);
                maxLen=Math.max(maxLen,r-l+1);
                r++;
        }
        return maxLen;
    }
}