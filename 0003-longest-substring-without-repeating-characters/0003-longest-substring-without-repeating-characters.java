class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int l=0,r=0;
        Set<Character> st = new HashSet<>();
        while(r < s.length()){
            if(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }else{
                maxLen=Math.max(maxLen,r-l+1);
                st.add(s.charAt(r));  
                r++;
            }  
        }
        return maxLen;
    }
}