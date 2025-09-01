class Solution162 {
    public int findPeakElement(int[] nums) {
        int size = nums.length;
        int i;
        for(i = 0 ; i < size-1 ; i++){
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        return i;
    }
}