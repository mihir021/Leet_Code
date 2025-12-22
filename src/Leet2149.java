class Solution2149 {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 1;
        int size = nums.length;
        int[] ans = new int[size];
        for(int n : nums){
            if(n>0){
                ans[i] = n;
                i+=2;
            }
            else{
                ans[j] = n;
                j+=2;
            }
        }
        return ans;
    }
}