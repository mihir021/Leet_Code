class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int temp1 = Integer.MAX_VALUE;
        int temp2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= temp1) {
                temp1 = num;
            } else if (num <= temp2) {
                temp2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}