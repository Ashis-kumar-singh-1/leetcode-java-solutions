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
    class Pair {
        TreeNode node;
        long index;
        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;
        while (!q.isEmpty()) {
            int currLevelSize = q.size();
            long startIndex = q.peek().index;
            long endIndex = 0;
            for (int i = 0; i < currLevelSize; i++) {
                Pair curr = q.remove();
                endIndex = curr.index;
                if (curr.node.left != null) {
                    // create new pair  object containing these two values.
                    q.add(new Pair(
                        curr.node.left,
                        curr.index * 2 + 1
                    ));
                }
                if (curr.node.right != null) {
                    q.add(new Pair(
                        curr.node.right,
                        curr.index * 2 + 2
                    ));
                }
            }
            int width = (int)(endIndex - startIndex + 1);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }
}