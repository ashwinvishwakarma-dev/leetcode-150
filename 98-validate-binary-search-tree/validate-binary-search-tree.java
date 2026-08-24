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

TreeNode prev= null;
boolean ans=true;

  public boolean isValidBST(TreeNode root) {
  if (root == null) {
			return true;
		}

//		Left
		boolean left = isValidBST(root.left);
		
		if (!left) {
			return false;
		}
		
		// Current
		if (prev == null) {
			prev = root;
		} else {
			if (root.val <= prev.val) {
				ans = false;
			}
      prev = root;
		}

//		Right
		boolean right = isValidBST(root.right);
		
		if (!right) {
			return false;
		}
		
		return ans;
}
}