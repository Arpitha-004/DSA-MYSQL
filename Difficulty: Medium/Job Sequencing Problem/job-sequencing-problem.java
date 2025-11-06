class Solution {
    private int find(int parent[], int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        
        int[][] jobs = new int[n][2];
        
        for(int i=0;i<n;i++){
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a,b) -> b[1]-a[1]);
        int maxDead = 0;
        for(int i=0;i<n;i++){
            maxDead = Math.max(maxDead,jobs[i][0]);
        }
        
        int parent[] = new int[maxDead + 1];

        // Initially every slot is parent of itself
        for (int i = 0; i <= maxDead; i++) {
            parent[i] = i;
        }

        int total = 0;
        int cnt = 0;

        // Process each job
        for (int i = 0; i < n; i++) {
            int d = jobs[i][0];
            int p = jobs[i][1];

            // Find latest free slot ≤ d
            int freeSlot = find(parent, d);

            if (freeSlot > 0) {
                // Occupy this slot → next free slot becomes freeSlot - 1
                parent[freeSlot] = find(parent, freeSlot - 1);

                cnt++;
                total += p;
            }
        }
        return new ArrayList<>(List.of(cnt, total));
    }
}