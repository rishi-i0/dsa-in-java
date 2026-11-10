import java.util.*;
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
      int curCnt=0;
      int n=nums.length;
      int maxCnt=0;
      for(int j=0;j<n;j++){
        if(nums[j]==1){
            curCnt++;

        }else{
         maxCnt=Math.max(maxCnt,curCnt);
         curCnt=0;
        }
      }return Math.max(maxCnt,curCnt);


    }
}