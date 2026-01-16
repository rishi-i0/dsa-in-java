class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num<=f){
                f=nums[i];
            }else if(num<=s){
                s=nums[i];
            }else{
                return true;
            }
        }return false;
    }
}