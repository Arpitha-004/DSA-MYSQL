class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mpp = new HashMap<>();

        for(char ch:s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        }
        List<Character> lst = new ArrayList<>(mpp.keySet());
        lst.sort((obj1,obj2) -> mpp.get(obj2) - mpp.get(obj1));

        StringBuilder ans = new StringBuilder();

        for(char ch:lst){
            for(int i=0;i<mpp.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}