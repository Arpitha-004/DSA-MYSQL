class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] alp_cnt = new int[26];

        for(int i=0;i<s.length();i++){
            alp_cnt[s.charAt(i) - 'a']++;
            alp_cnt[t.charAt(i) - 'a']--;
        }

        for(int cnt : alp_cnt){
            if(cnt != 0)
                return false;
        }

        return true;
    }
}