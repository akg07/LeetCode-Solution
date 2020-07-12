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
    private int MAX = 1;
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        List<Integer> list = new LinkedList<>();
        findMax(root, 0, 1, list);
        return MAX;
    }
    
    public void findMax(TreeNode root, int level, int pos, List<Integer> list) {
        if(root == null) return;
        if(level == list.size())
            list.add(pos);
        MAX = Math.max(MAX, pos+1-list.get(level));
        
        findMax(root.left, level+1, 2*pos, list);
        findMax(root.right, level+1, 2*pos+1, list);
    }
}