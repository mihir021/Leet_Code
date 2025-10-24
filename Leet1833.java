import java.util.Arrays;

class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);
        for(int i : costs){
            if(coins >= i){
                coins -= i;
                ans++;
            }
        }
        return ans;
    }
}