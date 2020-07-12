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
    public int[] getDiameter(TreeNode root) {
        int res[] = {0, 0};
        if(root != null) {
            int[] leftHeight = getDiameter(root.left);
            int[] rightHeight = getDiameter(root.right);
            
            int height = Math.max(leftHeight[0], rightHeight[0]) + 1;
            int leftDiameter = leftHeight[1];
            int rightDiameter = rightHeight[1];
            int rootDiameter = leftHeight[0] + rightHeight[0] + 1 ;
            int finalDiameter = getMax(leftDiameter, rightDiameter, rootDiameter);
            
            res[0] = height;
            res[1] = finalDiameter;
            
            return res;
        }
        return res;
    }
    
    public int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        return getDiameter(root)[1]-1;
    }
}