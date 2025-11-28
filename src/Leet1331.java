import java.util.Hashtable;
import java.util.PriorityQueue;

class Solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        int size = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.offer(num);
        }

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int rank = 1;

        while (!pq.isEmpty()) {
            int num = pq.poll();
            if (!ht.containsKey(num)) {
                ht.put(num, rank++);
            }
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = ht.get(arr[i]);
        }

        return result;
    }
}