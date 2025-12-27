import java.util.Stack;

class Solution227 {
    public int calculate(String s) {
        Stack<Integer> ans = new Stack<>();
        s = s.trim();
        char currentElement;
        char nextElement;
        for (int i = 0 ; i < s.length()-1 ; i++){
            currentElement = s.charAt(i);
            nextElement = s.charAt(i+1);

            if (Character.isDigit(currentElement)){
                ans.push(currentElement-'0');
            } else if (currentElement == '*') {
                ans.push(ans.pop()*(nextElement-'0'));
            } else if (currentElement == '/') {
                ans.push(ans.pop()/(nextElement-'0'));
            } else if (currentElement == '+') {
                ans.push((-'0'));
            }
        }
        // + -
        // 1 + 2 * 3  +4
        // 1  6
    }
}