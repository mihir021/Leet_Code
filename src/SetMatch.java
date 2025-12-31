class SolutionS {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int sum = nums[0];
        int d = 0;

        for (int i = 1; i < size; i++) {
            sum += nums[i];

            if (nums[i] == nums[i - 1]) {
                d = nums[i];
            }
        }
        int expectedSum = size * (size + 1) / 2;
        int missing = ;

        return new int[]{d, missing};
    }
}