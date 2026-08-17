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
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(preorder1(p) == preorder2(q)){
//             return true;
//         }
//         return false;
//     }
//     public void preorder1(TreeNode p){
//         if(p==null){
//             return;
//         }
//         preorder1(p.val);
//         preorder1(p.left);
//         preorder1(p.right);
//     }
//     public void preorder2(TreeNode q){
//         if(q==null){
//             return;
//         }
//         preorder2(q.val);
//         preorder2(q.left);
//         preorder2(q.right);
//     }
// }
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}