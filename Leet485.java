class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0; int ans = 0; int size = nums.length;
        if(size ==1 && nums[0] == 1){
            return 1;
        }
        if(size == 2 && nums[0] == 0 && nums[1] == 1){
            return 1;
        }
        for (int i = 0 ; i < (size-1) ; i++){
            if(nums[i] == 1){
                if(nums[i] == nums[i+1]){
                    if(max == 0){
                        max = 1;
                    }
                    max++;
                }else {
                    ans = Math.max(ans,max);
                    max = 1;
                }
            }
        }
        ans = Math.max(ans,max);
        return ans;
    }
}