import java.util.*;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                  i++;
                nums[i]=nums[j];
              
            }
        }return i+1;
    }
    public static void main(String[]args){
        int nums[]={1,1,2};
        int k=removeDuplicates(nums);
        for(int i=0;i<k;i++){
            System.out.println(nums[i] + " ");
        }
    }
}