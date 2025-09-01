import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        HashSet<Integer> hm1;
        for (int i = 0; i<nums.length; i++){
            hm1 = new HashSet<>();
            int a = -(nums[i]);
            for (int j = i+1; j<nums.length; j++){
                int b = a - nums[j];
                if(hm1.contains(b)){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],b)));
                }
                hm1.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);

    }
}