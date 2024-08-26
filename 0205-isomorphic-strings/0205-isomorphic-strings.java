class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s_arr = new int[128]; //128 icludes all ascii 
        int[] t_arr = new int[128];

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(s_arr[sc] == 0)
                s_arr[sc] = tc;
            if(t_arr[tc] == 0)
                t_arr[tc] = sc;

            if(s_arr[sc] != tc || t_arr[tc] != sc)
                return false;
        }
        return true;
    }
}