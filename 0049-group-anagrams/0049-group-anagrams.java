class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer> , List<String>> mpp = new HashMap<>();
        for(String s : strs){
            Map<Character,Integer> fmap = new HashMap<>();
            for(int i=0;i<s.length();i++){
                fmap.put(s.charAt(i), fmap.getOrDefault(s.charAt(i),0)+1);
            }
            List<String> lst = new ArrayList<>();
            if(!mpp.containsKey(fmap)){
                lst.add(s);
                mpp.put(fmap,lst);
            }else{
                lst = mpp.get(fmap);
                lst.add(s);
            }
        }
        List<List<String>> grp = new ArrayList<>();
        for(List<String> right : mpp.values()){
            grp.add(right);
        }
        return grp;
    }
}