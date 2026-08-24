/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        // Store parent of every node
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        makeParent(root, null, parent);
        // Queue for level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        // To avoid going back to the same node
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        int level = 0;
        while (!q.isEmpty()) {
            // If we reached distance k
            if (level == k) {
                break;
            }
            int size = q.size();
            // Process one complete level
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                // Go left
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }

                // Go right
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }
                // Go to parent backwards
                TreeNode par = parent.get(curr);
                if (par != null && !visited.contains(par)) {
                    visited.add(par);
                    q.add(par);
                }
            }
            level++;
        }
        // Queue now contains nodes at distance k
        // we will add all the value that we have remove from the queue 
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }
        return ans;
    }
    public void makeParent(TreeNode root,TreeNode par,Map<TreeNode, TreeNode> parent) {
        if (root == null) {
            return;
        }
        parent.put(root, par);
        makeParent(root.left, root, parent);
        makeParent(root.right, root, parent);
    }
}