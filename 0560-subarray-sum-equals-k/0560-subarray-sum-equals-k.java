import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) { 
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count =0;
        int prefix=0;
        for(int n:nums){
            prefix+=n;
            int remaining=prefix-k;
            if(map.containsKey(remaining)){
                count+=map.get(remaining);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);

        }return count;
    }
}