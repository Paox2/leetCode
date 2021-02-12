/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private :
    int sum = 0;
    void helper(TreeNode* node) {
        if(node->right)
            helper(node->right);
        
        sum += node->val;
        node->val = sum;
        
        if(node->left)
            helper(node->left);
    }
    
public:
    TreeNode* convertBST(TreeNode* root) {
        if (!root) 
            return root;
        
        helper(root);
        return root;
    }
};