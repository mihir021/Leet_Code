class Solution26 {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = -999;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= -998) {
                nums[ans] = nums[i];
                ans++;
            }
        }
        for (int i = ans; i < nums.length; i++) {
            nums[i] = 0;
        }
        return ans;
    }
}