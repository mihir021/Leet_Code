class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int []arr1:accounts){
            for(int i:arr1){
                sum += i;
            }
            max = Math.max(max,sum);
            sum=0;
        }
        return max;
    }
}