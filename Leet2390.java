import java.util.Stack;

class Solution2390 {
    public String removeStars(String s) {
        Stack<Character> st1 = new Stack<>();
        char[] chr = s.toCharArray();
        for (char ch : chr) {
            if (ch == '*') st1.pop();
            else st1.push(ch);
        }
        StringBuilder sb1 = new StringBuilder();
        for (char ch : st1) {
            sb1.append(ch);
        }
        return sb1.toString();
    }
}