import java.util.ArrayList;
import java.util.List;

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
class Solution94 {
    ArrayList<Integer> al1 = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        inorder(temp);
        return al1;
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        al1.add(root.val);
        inorder(root.right);
    }
}