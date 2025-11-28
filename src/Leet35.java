class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] >= target){
            return 0;
        }
        int size = nums.length;
        int i = 0;
        for( ; i < (size-1) ; i++){
            if(target <= nums[i+1]){
                return i+1;
            }
        }
        return i+1;
    }
}