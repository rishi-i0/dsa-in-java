class Solution {
    public int[][] merge(int[][] intervals) {
    List<int []> res=new ArrayList<>();
    int n=intervals.length;
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        while(i<n){
            if(res.isEmpty()){
                res.add(intervals[i]);
            }else {
                int[] last=res.get(res.size()-1);
                if(intervals[i][0]<=last[1]){
                    last[1]=Math.max(last[1],intervals[i][1]);
                }else{
                    res.add(intervals[i]);
                }
            }i++;

        }return res.toArray(new int[res.size()][]);
    }
}