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
    private static int sum = 0;
    private static void traverse(TreeNode root, boolean isLeft) {
        if(root != null && root.left == null && root.right == null) {
            if(isLeft) sum += root.val;
            return;
        }

        if(root != null && root.left != null && root.right != null) {
            // sum += root.left.val;
            traverse(root.left, true);
            traverse(root.right, false);
        } else if (root != null && root.left != null && root.right == null) {
            // sum += root.left.val;
            traverse(root.left, true);
        } else if (root != null && root.left == null && root.right != null) {
            traverse(root.right, false);
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // int sum = 0;
        sum = 0;
        traverse(root, false);

        return sum;
    }
}