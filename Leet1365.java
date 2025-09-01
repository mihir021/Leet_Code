import java.util.HashMap;
import java.util.PriorityQueue;

class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(size);
        for (int num : nums) {
            pq.offer(num);
        }
        int v = 0;
        HashMap<Integer,Integer> hm = new HashMap<>(size);
        while (!pq.isEmpty()){
            int temp = pq.poll();
            if(!hm.containsKey(temp)){
                hm.put(temp,v);
            }
            v++;
        }
        int ans[] = new int[size];
        for (int i = 0; i < size ; i++)
            ans[i] = hm.get(nums[i]);
        return ans;
    }
}