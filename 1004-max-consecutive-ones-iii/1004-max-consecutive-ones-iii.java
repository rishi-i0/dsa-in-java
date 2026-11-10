public class Solution {
    public int longestOnes(int[] nums, int k) {
     int left=0;
     int zeroCnt=0;
     int n=nums.length;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            zeroCnt++;
        } if(zeroCnt>k){
            
            if(nums[left]==0){
                zeroCnt--;
            }left++;
        }
     }return n-left;
    }
}
