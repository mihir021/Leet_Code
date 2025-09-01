import java.util.ArrayList;
import java.util.List;
class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> chaki = new ArrayList<>();
        postorderTraversal(root , chaki);
        return chaki;
    }
    void postorderTraversal(TreeNode chotu , List<Integer> chaki ){
        if(chotu == null ){
            return;
        }
        postorderTraversal(chotu.left , chaki);
        postorderTraversal(chotu.right , chaki);
        chaki.add(chotu.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}