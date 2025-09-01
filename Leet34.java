class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                if(ans[0] == -1){
                    ans[0] = i;
                    ans[1] = i;
                    continue;
                }
                ans[1] = i;
            }
        }
        return ans;
    }
}