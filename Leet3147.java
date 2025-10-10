class Solution3147 {
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int size = energy.length;
        int[] ans = new int[size];

        for (int i = size-1; i>=0; i--){
            ans[i] = energy[i];
            if((i+k)<size){
                ans[i] += ans[i+k];
            }
            max = Math.max(ans[i],max);
        }
        return max;
    }
}