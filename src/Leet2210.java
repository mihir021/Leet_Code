class Solution2210 {
    public int countHillValley(int[] nums) {
        int count = 0;
        int size = nums.length;
        for (int i = 1; i < (size - 1); i++) {
            if (nums[i] == nums[i + 1]) continue;

            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) prev--;

            if (prev >= 0) {
                if ((nums[i] > nums[prev] && nums[i] > nums[i + 1]) ||
                        (nums[i] < nums[prev] && nums[i] < nums[i + 1])) {
                    count++;
                }
            }
        }
        return count;
    }
}