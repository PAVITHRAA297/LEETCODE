// Last updated: 2/13/2026, 9:39:29 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] a =pattern.toCharArray();
        String[] b=s.split(" ");
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(a[i]==a[j]){
                    if(!b[i].equals(b[j])){
                        return false;
                    }
                }
                if(b[i].equals(b[j])){
                    if(a[i]!=a[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}