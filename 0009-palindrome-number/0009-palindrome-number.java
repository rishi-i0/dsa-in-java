class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
       int reversed=0;
       int original=x;
       while(x>0){
        int ld=x%10;
        reversed=reversed*10+ld;
        x=x/10;
       } if(original==reversed){
          return true;
       } else {
        return false;
       }
    }
}