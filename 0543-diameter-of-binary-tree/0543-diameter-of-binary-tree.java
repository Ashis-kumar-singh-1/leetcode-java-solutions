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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int diameter1 = diameterOfBinaryTree(root.left);
        int diameter2 = diameterOfBinaryTree(root.right);
        int diameter3 = height(root.left)+ height(root.right);
        return  Math.max(diameter1,Math.max(diameter2,diameter3)) ; 
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight,rightheight) + 1;
    }
    
}
// class Treeinfo {
//     int ht ;
//     int dia ; 
//     Treeinfo (int ht,int dia){
//         this.ht = ht;
//         this.dia = dia; 
//     }
// }
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return new Treeinfo(0, 0);
//         }
//       Treeinfo left = diameterOfBinaryTree(root.left);
//       Treeinfo right = diameterOfBinaryTree(root.right);
//       int height = Math.max(left.ht,right.ht)+1;
//       int diameter1 = root.dia;
//       int diameter2 = root.dia;
//       int diameter3 = left.ht+ right.ht ;
//       return  Math.max(diameter1,Math.max(diameter2,diameter3)) ; 
//     }
// }