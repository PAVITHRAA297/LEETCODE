// Last updated: 2/13/2026, 9:39:20 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Integer prev=null;
    private int count=0;
    private int maxCount=0;
    private List<Integer> modes=new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] result=new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            result[i]=modes.get(i);
        }
        return result;
        
    }
    private void inOrder(TreeNode node){
        if(node == null)
        return;
        inOrder(node.left);
        if(prev!=null && node.val==prev){
            count++;
        }
        else{
            count=1;
        }
        if(count > maxCount){
            modes.clear();
            modes.add(node.val);
            maxCount=count;
        }
        else if(count==maxCount){
            modes.add(node.val);
        }
        prev=node.val;
        inOrder(node.right);
    }
}