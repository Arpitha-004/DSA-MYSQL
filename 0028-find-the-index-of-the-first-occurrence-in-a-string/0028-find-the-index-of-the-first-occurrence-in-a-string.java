class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return -1;
        
        int len = haystack.length() - needle.length() + 1;
        for(int i=0;i<len;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}