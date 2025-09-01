import java.util.ArrayList;
import java.util.List;

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> chaki = new ArrayList<>();
        preorder(root , chaki);
        return chaki;
    }
    void preorder(TreeNode chotu , List<Integer> chaki ){
        if(chotu == null ){
            return;
        }
        chaki.add(chotu.val);
        preorder(chotu.left , chaki);
        preorder(chotu.right , chaki);
    }
}