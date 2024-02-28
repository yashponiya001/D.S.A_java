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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =0, min_level = 0, maxSum = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            level++;
            int levelSum = 0;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                levelSum += node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if(levelSum>maxSum){
                maxSum = levelSum;
                min_level = level;
            }
        }
        return min_level;
    }
}
