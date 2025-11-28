import java.util.Arrays;

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int r = 1;
        int i;
        int cp = 0;
        if(nums.length >= 2) if(nums[0] == 1 && nums[1] != 2 && (nums[0] != nums[1])) return 2;
        for(i = 0 ; i < (nums.length-1) ; i++){
            if(nums[i] > 0){
                cp++;
                if(nums[i] != 1 && cp == 1){
                    return r;
                }
                if(nums[i] == nums[i+1] || (nums[i] == (nums[i+1]-1)) ){
                    if((nums[i] == nums[i+1]-1))  r++;
                }else {
                    return ++r;
                }
            }
        }
        if(nums[nums.length-1] == 1) return 2;
        if(i == 0) return 1;
        if(r == 1 ) return r;
        return ++r;
    }
}