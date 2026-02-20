class Solution {
    public int majorityElement(int[] nums) {
      int m=nums[0];
      int v=0;
      for(int i=0;i<nums.length;i++){
        if(v==0){
            m=nums[i];
            v++;
        }
        else if(m==nums[i]){
            v++;
        }else{
            v--;
        }
      }return m;
    }
}
