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
    public int maxDepth(TreeNode root) {
        int result = getDepth(root);
        return result;
    }
    
    private int getDepth(TreeNode node) {
        if (node != null) {
            return 1 + Math.max(getDepth(node.left), getDepth(node.right));
        }
        return 0;
        
    }
}