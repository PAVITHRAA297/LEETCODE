// Last updated: 2/13/2026, 9:39:28 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        else{
            if(n<=0 || n%3!=0){
                return false;
            }
            return isPowerOfThree(n/3);
        }
    }
}