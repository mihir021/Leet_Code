class Solution2016 {
    public int maximumDifference(int[] nums) {

        int min = nums[0];      // smallest value seen so far
        int maxDiff = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];  // update minimum if current is smaller
            }
        }

        return maxDiff;


    }
}