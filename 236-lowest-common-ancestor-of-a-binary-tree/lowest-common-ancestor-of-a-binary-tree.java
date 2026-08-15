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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
    if (root == null) {
        return null;
    }

    // If current node is p or q
    if (root == p || root == q) {
        return root;
    }

    // Search left and right
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    // p and q found on different sides
    if (left != null && right != null) {
        return root;
    }

    // Return whichever side found p or q
    if (left != null) {
        return left;
    }

    return right;
    }
}