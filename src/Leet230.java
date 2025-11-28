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
class Solution230 {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return inOrder(root, k);
    }

    int inOrder(TreeNode node, int k) {
        if (node == null) return 1;

        inOrder(node.left, k);

        count++;
        if (count == k) {
            return node.val;
        }

        inOrder(node.right, k);
        return node.val;
    }
}