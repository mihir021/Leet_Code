import java.util.Comparator;
import java.util.PriorityQueue;

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        while (k > 0){
            pq.remove();
            k--;
        }
        return pq.remove();

    }
}