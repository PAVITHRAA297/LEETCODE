// Last updated: 2/13/2026, 9:39:33 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        else{
            if(n<=0 || n%2!=0){
                return false;
            }
            return isPowerOfTwo(n/2);
        }
    }
}