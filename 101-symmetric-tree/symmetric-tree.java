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
    private boolean isLeftAndRightSame(TreeNode left, TreeNode right) {
        if(left != null && right != null && left.left == null && right.right == null 
        && left.right == null && right.left == null && left.val == right.val) return true;
        
        if(left != null && right != null && left.left != null && right.right != null
        && left.right != null && right.left != null) {
            return isLeftAndRightSame(left.left, right.right) && left.val == right.val 
            && isLeftAndRightSame(right.left, left.right);
        } else if(left != null && right != null && left.left != null && right.right != null
        && left.right == null && right.left == null) {
            return isLeftAndRightSame(left.left, right.right) && left.val == right.val;
        } else if(left != null && right != null && left.left == null && right.right == null
        && left.right != null && right.left != null) {
            return left.val == right.val && isLeftAndRightSame(right.left, left.right);
        } else {
            return false;
        }
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root != null && root.left == null && root.right == null) return true;

        return isLeftAndRightSame(root.left, root.right);
    }
}