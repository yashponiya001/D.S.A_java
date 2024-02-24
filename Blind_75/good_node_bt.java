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
   int res = 0;
    public int goodNodes(TreeNode root) {
        traverse(root, Integer.MIN_VALUE);
        return res;
    }
    public void traverse(TreeNode node, int max) {
        if(node == null) return;
        if(node.val >= max){            
            max = node.val;                       
            res++;
        }
        traverse(node.left, max);
        traverse(node.right, max);
    }
}
