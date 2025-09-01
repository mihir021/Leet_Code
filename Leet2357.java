import java.util.HashSet;

class Solution2357 {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num != 0) {
                set.add(num);
            }
        }
        return set.size();
    }
}