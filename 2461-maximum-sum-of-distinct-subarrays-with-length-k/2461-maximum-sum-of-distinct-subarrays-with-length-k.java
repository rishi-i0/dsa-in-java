class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        long curSum=0 , maxSum=0;
        int L=0;
        for(int R=0;R<nums.length;R++){
          while(set.contains(nums[R]) || set.size()==k){ 
            set.remove(nums[L]);
            curSum-=nums[L];
            L++;
          }
          curSum+=nums[R]; 
          set.add(nums[R]);
          if(set.size()==k){
            maxSum=Math.max(curSum,maxSum);
          }


        }return maxSum;

    }
}