class NumArray {


    int[] nums1;
    public NumArray(int[] nums) {
        nums1 = new int[nums.length];
        nums1[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            nums1[i] = nums1[i-1]+nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left==0) return nums1[right];
        return nums1[right]-nums1[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */