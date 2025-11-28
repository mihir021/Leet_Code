class Solution396 {
    public static int maxRotateFunction(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0 ,fix = 0; fix < nums.length ; fix++ ){
            i = fix;
            int sum = 0;
            for(int j = 0 ; j < nums.length ; j++){ // multi *
                sum += (j*nums[(i)% nums.length]);
                i++;
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        maxRotateFunction(new int[]{4,3,2,6});
    }
}