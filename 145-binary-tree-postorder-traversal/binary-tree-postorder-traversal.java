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
    private static void traverse(TreeNode root, List<Integer> postorder) {
        if(root != null && root.left == null && root.right == null) {
            postorder.add(root.val);
            return;
        }

        if(root != null && root.left != null && root.right != null) {
            traverse(root.left, postorder);
            traverse(root.right, postorder);
            postorder.add(root.val);
        } else if (root != null && root.left != null && root.right == null) {
            traverse(root.left, postorder);
            postorder.add(root.val);
        } else if (root != null && root.left == null && root.right != null) {
            traverse(root.right, postorder);
            postorder.add(root.val);
        }
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        
        traverse(root, postorder);
        return postorder;
    }
}