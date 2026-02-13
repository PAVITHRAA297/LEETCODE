// Last updated: 2/13/2026, 9:38:50 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a';i<='z';i++){
            if(sentence.indexOf(i)==-1){
                return false;
            }
        }
        return true;
    }
}