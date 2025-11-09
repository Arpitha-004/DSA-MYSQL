class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        Data[] arr = new Data[n];
        for(int i=0;i<n;i++){
            arr[i] = new Data(start[i],end[i]);
        }
        Arrays.sort(arr, (a,b)->a.e-b.e);
        int cnt = 1;
        int free = arr[0].e;
        for(int i=1;i<n;i++){
            if(arr[i].s > free){
               cnt++;
                free = arr[i].e; 
            }
            
        }
        return cnt;
    }
    
}
class Data{
    int s,e;
    Data(int s, int e){
        this.s = s;
        this.e = e;
    }
}
