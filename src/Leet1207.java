import java.util.HashMap;
import java.util.HashSet;

class Solution1207 {
    // 1,2,2,1,1,3
    // [1,3] [2,2] [3,1]
    public static boolean uniqueOccurrences(int[] arr) {
        //       values , freq
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for (int j : arr) {
            if (!hm1.containsKey(j)) {
                hm1.put(j, 1);
            } else {
                hm1.put(j, hm1.get(j) + 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>(hm1.values());
        return hashSet.size()==hm1.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}