class Solution2401 {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, currentAnd = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((currentAnd & nums[i]) != 0) {
                currentAnd -= nums[left];
                left++;
            }
            currentAnd += nums[i];
            if (i - left + 1 > count) {
                count = (i) - left + 1;
            }
        }
        return count;
    }
}

