class Solution1493 {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int fix = 0;
        int maxAns = 0;
        for (int num : nums) {
            if (num == 1) {
                ans++;
            } else {
                fix = ans;
                ans = 0;
            }
            maxAns = Math.max(maxAns, fix + ans);
        }
        if (maxAns== nums.length) return nums.length-1;
        return Math.max(ans,maxAns);
    }
}