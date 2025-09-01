import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (String str : strs) {
            for (int j = 0; j < str.length(); j++)
                pq.add(str.charAt(j));

            while (!pq.isEmpty())
                temp.append(pq.remove());
            al.add(temp+"");
            temp = new StringBuilder();
        }
        // [aet, aet, ant, aet, ant, abt]
        System.out.println(al);

        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && al.get(i).equals(al.get(j))) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);
        }

        return ans;
    }
}