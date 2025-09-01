class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] left_product = new int[size];
        int[] right_product = new int[size];

        left_product[0] = 1;
        for(int i = 1 ; i < size ; i++){
            left_product[i] = left_product[i-1]*nums[i-1];
        }

        right_product[size-1] = 1;
        for(int i = size-2 ; i >= 0 ; i--){
            right_product[i] = right_product[i+1]*nums[i+1];
        }

        for(int i = 0 ; i < size; i++){
            nums[i] = right_product[i]*left_product[i];
        }

        return nums;
    }
}