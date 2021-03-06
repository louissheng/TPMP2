/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
    		return true;
    	} else {
    		return isSymmetric(root.left, root.right);
    	}
        }
        public boolean isSymmetric(TreeNode l, TreeNode r) {
    	if (l == null && r == null) {
    		return true;
    	}
    	if (l!= null && r == null) {
    		return false;
    	}
    	if (l==null && r!=null) {
    		return false;
    	}
    	if (l.val != r.val){
    	    return false;
    	}
    	if (!isSymmetric(l.left, r.right) || !isSymmetric(l.right,r.left)) {
    		return false;
    	}
        return true;
    }
}
