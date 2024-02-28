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
    //method to find minimum value in BST
    public int mVa(TreeNode root){
        int mV=root.val;
        while(root.left!=null){
            mV=root.left.val;
            root=root.left;
        }
        return mV;
    }
    // Method to delete a node from a BST
    public TreeNode deleteNode(TreeNode root,int key){
        if (root==null){
            return null; 
        }
        if (key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if (key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else {
            if (root.left==null){
                return root.right;
            } 
            else if (root.right==null){
                return root.left;
            }
            root.val=mVa(root.right);
            root.right=deleteNode(root.right, root.val);
            }
        return root;
    }
}
