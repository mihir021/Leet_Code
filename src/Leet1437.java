class Solution1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int size = nums.length-1;

        for(int z : nums){
            if(z==1) break;
            i++;
        }
        int j = i+1;
        while(j<=size && i<=size){
            if(nums[j]==1) {
                if((j-i-1)<k) return false;
                i = j;
            }
            j++;
        }
        return true;
    }
}