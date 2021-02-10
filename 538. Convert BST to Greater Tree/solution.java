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
    private int sum;
    
    public TreeNode convertBST(TreeNode root) {
        ConvertTree(root);
            
        return root;
    }
     
    private void ConvertTree(TreeNode root) {
        if(root == null)
            return;
        
        ConvertTree(root.right);
        
        root.val += sum;
        sum = root.val;
        
        ConvertTree(root.left);
    }
}