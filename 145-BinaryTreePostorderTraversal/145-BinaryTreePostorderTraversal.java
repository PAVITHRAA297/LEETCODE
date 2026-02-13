// Last updated: 2/13/2026, 9:39:45 AM
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
     List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
          traversal(root);
        return list;
    }
    public void traversal(TreeNode root){
        if(root==null)
        return;
        traversal(root.left);
        traversal(root.right);
        list.add(root.val);
    }
}