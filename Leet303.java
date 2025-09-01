class NumArray {
    int []numArray;
    public NumArray(int[] nums) {
        int s = nums.length;
        numArray = new int[s];
        for(int i = 0 ; i < (s) ; i++){
            numArray[i] = nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left ; i <= right ; i++){
            sum += numArray[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */