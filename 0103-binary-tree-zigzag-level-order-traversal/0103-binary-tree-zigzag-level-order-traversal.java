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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> level =  new ArrayList<>();
        boolean leftToRight = true;
        while(!q.isEmpty()) {
            TreeNode curr = q.remove();
            if(curr == null){
                if (!leftToRight) {
                    Collections.reverse(level);}
                ans.add(level);
                if(q.isEmpty()){
                    break;
                }
                level = new ArrayList<>();
                leftToRight = !leftToRight;
                q.add(null);
            }
            else{
                if(curr.left != null){
                    q.add(curr.left);
                }if(curr.right != null){
                    q.add(curr.right);
                }
                level.add(curr.val);
            } 
        }
        return ans;
        
    }
}