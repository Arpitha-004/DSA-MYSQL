class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }else{
                ans.get(ans.size()-1).set(1, Math.max(intervals[i][1],ans.get(ans.size()-1).get(1)));
            }
        }
        return ans.stream()
                  .map(l -> new int[]{l.get(0), l.get(1)})
                  .toArray(int[][]::new);
    }
}