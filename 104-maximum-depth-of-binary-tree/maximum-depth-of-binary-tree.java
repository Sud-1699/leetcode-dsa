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
    public int maxDepth1(TreeNode root, int depth) {
        if(root != null && root.left == null && root.right == null) return ++depth;

        if(root != null && root.left != null && root.right != null) {
            ++depth;
            return Math.max(maxDepth1(root.left, depth), maxDepth1(root.right, depth));
        } else if(root != null && root.left != null && root.right == null) {
            ++depth;
            return Math.max(depth, maxDepth1(root.left, depth));
        } else if(root != null && root.left == null && root.right != null) {
            ++depth;
            return Math.max(depth, maxDepth1(root.right, depth));
        } else {
            return ++depth;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        return maxDepth1(root, 0);
    }
}