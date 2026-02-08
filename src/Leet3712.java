class Solution3712 {
    public int sumDivisibleByK(int[] nums, int k) {

        int[] freq = new int[100];
        for(int i : nums){
            freq[i-1]++;
        }
        int sum = 0;
        int j = 1;
        for(int i : freq){
            if(i>0 && i%k==0)  sum += (i*j);
            j++;
        }
        return sum;
    }
}
