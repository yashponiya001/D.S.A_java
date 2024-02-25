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
     public int longestZigZag(TreeNode root) {
        return longest(root, 0);
    }

    public int longest(TreeNode root, int dir){
        if (root == null){
            return 0;
        }

        int max = 0;

        int n1 = 0;
        boolean lastLeft = true;
        TreeNode cur = root.left;
        while (cur != null){
            n1++;
            if (lastLeft){
                max = java.lang.Math.max(longest(cur.left, 2), max);
                cur = cur.right;
            }
            else{
                max = java.lang.Math.max(longest(cur.right, 1), max);
                cur = cur.left;
            }
            lastLeft = !lastLeft;
        }

        int n2 = 0;
        lastLeft = false;
        cur = root.right;
        while (cur != null){
            n2++;
            if (lastLeft){
                max = java.lang.Math.max(longest(cur.left, 2), max);
                cur = cur.right;
            }
            else{
                max = java.lang.Math.max(longest(cur.right, 1), max);
                cur = cur.left;
            }
            lastLeft = !lastLeft;
        }

        if(dir==1){
            n1++;
        }
        else if(dir==2){
            n2++;
        }
        int n = java.lang.Math.max(n1, n2);

        return java.lang.Math.max(n,max);
    }
}
