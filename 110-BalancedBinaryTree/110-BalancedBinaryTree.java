// Last updated: 2/13/2026, 9:39:53 AM
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int diff = leftHeight - rightHeight;
        if (diff < 0) diff = -diff; 

        if (diff > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        int max;
        if (left > right) {
            max = left;
        } else {
            max = right;
        }

        return max + 1;
    }
}
