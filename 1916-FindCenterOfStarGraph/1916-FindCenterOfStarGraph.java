// Last updated: 2/13/2026, 9:38:52 AM
class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }else{
            return edges[0][1];
        }
    }
}