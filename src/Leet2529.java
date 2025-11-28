class Solution2529 {
    public int maximumCount(int[] nums) {

        int positive = 0;
        int negitive = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive++;
            }
            if(nums[i]<0){
                negitive++;
            }
        }

        return (int)Math.max(positive, negitive);
    }
}