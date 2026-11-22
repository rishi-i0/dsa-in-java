import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] meet) {
        int n = meet.length;
        Arrays.sort(meet,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=0; int lastElem= meet[0][1];
        for(int i=1;i<n;i++){
            if(meet[i][0]<lastElem){
                cnt++;
            }
            else{
                lastElem=meet[i][1];
            }
        } return cnt; 
     
    }
}