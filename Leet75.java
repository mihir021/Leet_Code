class Solution75 {
    public void sortColors(int[] nums) {
        int i1 = 0;
        int num_0 = 0;
        int num_1 = 0;
        int num_2 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0) num_0++;
            if(nums[i] == 1) num_1++;
            if(nums[i] == 2) num_2++;
        }
        while (num_0-- > 0)  nums[i1++] = 0;
        while (num_1-- > 0)  nums[i1++] = 1;
        while (num_2-- > 0)  nums[i1++] = 2;
    }
}