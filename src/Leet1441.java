import java.util.ArrayList;
import java.util.List;

class Solution1441 {
    public List<String> buildArray(int[] target, int n) {
        int j = 0;
        List<String> ans = new ArrayList<>();
        int size = target.length;
        for(int i = 1; i<=n && j<size; i++){
            if(target[j++]==i) ans.add("Push");
            else{
                j--;
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}