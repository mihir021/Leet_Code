import java.util.HashSet;

class Solution2442 {
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> hs1 = new HashSet<>();
        for (int j : nums) {
            hs1.add(j);
            hs1.add(reverse(j));
        }
        return hs1.size();
    }
    int reverse(int num){
        int rev = 0;
        while (num > 0) {
            rev = (num % 10) + rev * 10;
            num /= 10;
        }
        return rev;
    }
}