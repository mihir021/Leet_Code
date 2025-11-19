import java.util.HashSet;

class Solution2154 {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i : nums) hs1.add(i);
        while (hs1.contains(original)){
            original = original*2;
        }
        return original;
    }
}