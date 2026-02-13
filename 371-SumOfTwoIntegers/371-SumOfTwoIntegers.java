// Last updated: 2/13/2026, 9:39:23 AM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b; 
            a = a ^ b;
            b=carry << 1;
    }
    return a;
}
}
