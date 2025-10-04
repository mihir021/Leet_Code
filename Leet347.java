import java.util.*;
class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer,Integer> ht1 = new Hashtable<>();

        for (int i : nums){
            if(!ht1.containsKey(i)) ht1.put(i,1);
            else{
                ht1.put(i,ht1.get(i)+1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(ht1.entrySet());

        int []ans = new int[k];
        // Getting elements in order of frequency
        while (k>0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            ans[--k] = entry.getKey();
        }
        return ans;
    }
}