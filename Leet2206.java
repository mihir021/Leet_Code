class Solution2206 {
    public boolean divideArray(int[] nums) {
        boolean ans = false;

        int count[] = new int[(nums.length)];

        if (nums.length % 2 == 0) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count[i]++;
                    }
                }

                if (count[i] % 2 == 0) {
                    ans = true;
                } else {
                    ans = false;
                    break;
                } // end of outer for loop..

            } // end of if

        }
        return ans;

    }
}
