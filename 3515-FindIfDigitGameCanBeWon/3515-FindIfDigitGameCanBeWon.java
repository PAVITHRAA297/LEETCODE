// Last updated: 2/13/2026, 9:38:44 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int Single = 0;
        int Double = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < 10) {
                Single += num;
            } else {
                Double += num;
            }
        }
        return Single != Double;
    }
}
