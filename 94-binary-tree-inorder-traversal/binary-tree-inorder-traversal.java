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
    private static List<Integer> result = null;
    
    private void traverse(TreeNode root) {
        if(root != null && root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }


        if(root != null && root.left != null && root.right != null) {
            traverse(root.left);
            result.add(root.val);
            
            traverse(root.right);
        } else if (root != null && root.left != null && root.right == null) {
            traverse(root.left);

            result.add(root.val);
        } else if (root != null && root.left == null && root.right != null) {
            result.add(root.val);

            traverse(root.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        traverse(root);
        return result;
    }
}