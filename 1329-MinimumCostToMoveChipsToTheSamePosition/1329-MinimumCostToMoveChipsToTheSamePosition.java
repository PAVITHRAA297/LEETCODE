// Last updated: 2/13/2026, 9:38:58 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
     int even=0,odd=0;
     for(int i=0;i<position.length;i++)
     {
        if(position[i]%2==0) even++;
        else odd++;
     }   
     return Math.min(odd,even);
    }
}