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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        maxPath(root);
        return maxsum;
    }
    public int maxPath(TreeNode root) {
        if(root == null)
            return 0;
        int leftmax =  maxPath(root.left);
        int rightmax =  maxPath(root.right);
        
        leftmax = Math.max(0,leftmax);
        rightmax = Math.max(0,rightmax);

        int currentpath =  root.val + leftmax + rightmax;

        maxsum = Math.max(maxsum,currentpath);

        return root.val + Math.max(leftmax,rightmax); 
    
    }
}