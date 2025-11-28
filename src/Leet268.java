import java.util.Arrays;

class Solution268 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == ans){
                ans++;
            }
        }
        return ans;
    }
}