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
       if(root ==null) return 0;//base case
       int maxLeft = maxDepth(root.left);// hypothesis
       int maxRight = maxDepth(root.right);
       return Math.max(maxLeft, maxRight) +1; //induction
    }
}
