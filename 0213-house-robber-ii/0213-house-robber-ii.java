class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int []dp1=new int[n];
        int []dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1=f(n-2,nums,0,dp1);
        int case2=f(n-1,nums,1,dp2);
        return Math.max(case1,case2);
        
    } int f(int ind,int []nums, int start,int []dp){
        if(ind==start) return nums[ind];
        if(ind<start) return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
      int  pick=nums[ind]+f(ind-2,nums,start,dp);
       int  nonPick=f(ind-1,nums,start,dp);

        return dp[ind]=Math.max(pick, nonPick);
    }
}