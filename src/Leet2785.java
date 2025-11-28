import java.util.PriorityQueue;

class Solution2785 {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(char i : s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||
                    i=='U'||i=='O'||i=='I'){
                pq.add(i);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char i : s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||
                    i=='U'||i=='O'||i=='I'){
                ans.append(pq.poll());
            }
            else {
                ans.append(i);
            }
        }
        return ans.toString();
    }
}