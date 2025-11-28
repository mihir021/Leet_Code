class Solution922 {
    public static int[] sortArrayByParityII(int[] nums) {
        // 5,7,3,5,2,6,8,10
        int j;
        for (int i = 0; i< nums.length; i++){
            j=i;
            if(nums[i]%2==0 && i%2==1){
                do j++;
                while (nums[j] % 2 == 0);
                nums[i] = nums[j] + nums[i] - (nums[j] = nums[i]);
            }
            else if(nums[i]%2==1 && i%2==0){
                do j++;
                while (nums[j] % 2 != 0);
                nums[i] = nums[j] + nums[i] - (nums[j] = nums[i]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        sortArrayByParityII(new int[]{ 5,7,3,5,2,6,8,10});
    }
}