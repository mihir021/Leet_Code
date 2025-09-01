import java.util.Objects;
import java.util.PriorityQueue;

class Solution169 {
    public int majorityElement(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int s = nums.length;
        for (int num : nums) {
            pq.offer(num);
        }
        int max = 1;
        int ans = 0;
        int x = 0;
        int r = nums[0];
        for(int i = 0 ; i < (s) ; i++){
            x = pq.remove();
            if(Objects.equals(x, pq.peek())){
                max++;
            }else {
                if(ans < max){
                    ans = max;
                    r = x;
                }
                max = 1;
            }
        }
        return r;
    }
}