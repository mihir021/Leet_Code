class Solution2460 {
    public int[] applyOperations(int[] nums) {

        for(int i=0;i<(nums.length-1);i++){
            if (nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int c =0;
        for(int i=0; i<(nums.length) ; i++){
            if(nums[i] != 0){
                nums[c] =nums[i];
                c++;
            }
        }
        for(int i=c; c<(nums.length) ; c++)
            nums[c] = 0;

        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }
        return nums;
    }
}