import java.util.ArrayList;
import java.util.List;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> s = new ArrayList<>();
        int s1 = nums.length;
        int lastadd = -889;
        for (int i = 0 ; i < (s1) ; i++){
            if(nums[i] == nums[(i+1)%s1]-1 ){
                if(lastadd == -889)
                    lastadd = nums[i];
            }else {
                if(lastadd != -889){
                    s.add(lastadd+"->"+nums[i]);
                    lastadd = -889;
                }else {
                    lastadd = -889;
                    s.add(String.valueOf(nums[i]));
                }
            }
        }
        if(lastadd != -889){
            s.add(String.valueOf(nums[s1-1]));
        }
        return s;
    }
}