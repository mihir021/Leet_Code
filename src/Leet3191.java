class Solution3191 {
    public int minOperations(int[] nums) {
        int ans = 0;
        boolean found = false;

        for(int i =0 ; i<(nums.length-2) ; i++){
            if(nums[i] == 0){

                nums[i] = 1;
                if(nums[i+1] == 1) nums[i+1] = 0;
                else if(nums[i+1] == 0) nums[i+1] = 1;
                if(nums[i+2] == 0) nums[i+2] = 1;
                else if(nums[i+2] == 1) nums[i+2] = 0;

                ans++;
            }
        }
        for (int num : nums) {
            if (num == 1) found = true;
            else {
                found = false;
                break;
            }
        }


        if(found)  return ans;
        else  return -1;
    }
}
