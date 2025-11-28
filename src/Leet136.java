class Solution136 {
    public int singleNumber(int[] nums) {
        int ans1 = nums[0];
        for (int i = 1; i<nums.length; i++){
            ans1 = nums[i]^ans1;
        }
        return ans1;
    }
}