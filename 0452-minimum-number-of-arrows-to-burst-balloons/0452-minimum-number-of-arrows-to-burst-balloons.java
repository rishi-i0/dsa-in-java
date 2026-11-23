class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
         if (n == 0) return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));//sort by ending point
        int arrow=1;int arrowPosition=points[0][1];
        for(int i=1;i<n;i++){
            if(points[i][0]>arrowPosition){
                arrow++;
                arrowPosition=points[i][1];
            }
        }return arrow;
        
    }
}