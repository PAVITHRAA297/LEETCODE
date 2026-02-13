// Last updated: 2/13/2026, 9:38:53 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            boolean isconsistent = true;
            for(char c:s.toCharArray()){
                if(!allowed.contains(s.valueOf(c))){
                    isconsistent  = false;
                    break;
                }
            }
            if(isconsistent){
                count++;
            }
        }return count;
    }
}
