class Solution2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int sum = 0;
        int temp = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            leftSum[i] = temp;
            temp += nums[i];
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = Math.abs(leftSum[i] - (sum - leftSum[i]-nums[i]));
        }
        return nums;
    }
}