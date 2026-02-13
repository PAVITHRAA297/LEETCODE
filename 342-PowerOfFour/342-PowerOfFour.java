// Last updated: 2/13/2026, 9:39:25 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        else{
            if(n<=0 || n%4!=0){
                return false;
            }
            return isPowerOfFour(n/4);
        }
    }
}