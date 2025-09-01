class Solution3637 {
    public boolean isTrionic(int[] nums) {
        int size = nums.length;
        if (size < 3) return false;

        int i = 0;
        while (i < size - 1 && nums[i] < nums[i + 1]) i++;
        if (i == 0) return false;

        int j = i;
        while (j < size - 1 && nums[j] > nums[j + 1]) j++;
        if (j == i) return false;

        int z = j;
        while (z < size - 1 && nums[z] < nums[z + 1]) z++;
        if (z == j) return false;

        return z == size - 1;
    }
}
