class Solution283 {
    public void moveZeroes(int[] nums) {
        for(int i = 0 ; i < (nums.length-1) ; i++){
            if(nums[i] == 0){
                int temp = i;
                while (nums[temp] == 0){
                    if(temp >= (nums.length-1) ){
                        return;
                    }
                    temp++;
                }
                nums[temp] = nums[temp] + nums[i]  - (nums[i] = nums[temp]) ;
            }
        }
    }
}