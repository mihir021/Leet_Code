import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        int size = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        for(int i = 0 ; i < size ; i++){
            if(pq.remove()==target){
                al.add(i);
            }
        }
        return al;
    }
}