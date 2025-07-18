class Solution {
    public String reverseWords(String s) {
        String[] st = s.split(" +");
        StringBuilder sb = new StringBuilder();
        int i=st.length-1;
        while(i>=0){
            sb.append(st[i]);
            sb.append(" ");
            i--;
        }
        return sb.toString().trim();
    }
}