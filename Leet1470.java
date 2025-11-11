class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k = 0;
        int[] numNum = new int[nums.length];
        while((n--)>0){
            numNum[k] = nums[i++];
            numNum[++k] = nums[j++];
            k++;
        }
        return numNum;
    }
}