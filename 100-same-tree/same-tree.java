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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.left == null && p.right == null && 
        q.left == null && q.right == null && p.val == q.val)
            return true;

        if (p != null && q != null && p.left != null && p.right != null && 
            q.left != null && q.right != null) {
            return isSameTree(p.left, q.left) && p.val == q.val && isSameTree(p.right, q.right);
        } else if (p != null && q != null && p.left != null && p.right == null && 
            q.left != null && q.right == null) {
            return isSameTree(p.left, q.left) && p.val == q.val;
        } else if (p != null && q != null && p.left == null && p.right != null && 
            q.left == null && q.right != null) {
            return p.val == q.val && isSameTree(p.right, q.right);
        } else if (p == null && q == null) {
            return true;
        } else {
            return false;
        }
    }
}