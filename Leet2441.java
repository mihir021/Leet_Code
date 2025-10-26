import java.util.Arrays;

class Solution2441 {
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length -1 ;
        while(low <= high) {
            if((-1*nums[low]) == nums[high]){
                return nums[high];
            } else if (nums[low] > 0) {
                break;
            } else if ((-1*nums[low]) > nums[high]) {
                low++;
            }else {
                high--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        findMaxK( new int[]{-10,8,6,7,-2,-3});
    }
}