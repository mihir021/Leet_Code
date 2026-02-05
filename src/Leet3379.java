class Solution3379 {
    public int[] constructTransformedArray(int[] nums) {
        // [ 3,-2,1,1,3,4,5 ]

        int size = nums.length;
        int[] ans = new int[size];
        int i = 0;
        for(int num : nums){
            num = num%size;
            ans[i] = nums[(i + num + size)%size];
            i++;
        }
        return ans;

    }
}