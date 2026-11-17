/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int l=0;
        int r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(mountainArr.get(m)<mountainArr.get(m+1)){
                l=m+1;
            }else{
                r=m;
            }
        } int peak=l;
        //here we search in ascening for the minimum index to return 
         l=0; r=peak;
        while(l<=r){
            int m=l+(r-l)/2;
            int value=mountainArr.get(m);
            if(value==target){
                return m;
            } else if(value<target){
                l=m+1;
            }else{
                r=m-1;
            }
        } 

       
             l=peak+1;
              r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int value=mountainArr.get(m);
            if(value==target){
                return m;
            } else if(value<target){
                 r=m-1;
              
            }else{
                 l=m+1;
            }
        } return -1;


  

    }
}