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
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length-1);
    }
    
    private TreeNode buildTree(int[] preorder, int l, int r) {
        if(l > r) return null;
        
        TreeNode root = new TreeNode(preorder[l]);
        if(l == r) return root;
        
        int index = l+1;
        while(index <= r && preorder[index] < preorder[l])
            index++;
        
        root.left = buildTree(preorder, l+1, index-1);
        root.right = buildTree(preorder, index, r);
        
        return root;
    }
}