import java.util.Stack;

class Solution227 {
    public static int calculate(String s) {
        Stack<Integer> ans = new Stack<>();
        s = s.trim();
        if (s.length() == 1){
            return s.charAt(0)-'0';
        }
        char currentElement;
        char nextElement;
        String temp="";
        boolean fix;
        for (int i = 0 ; i < s.length()-1 ; i++){
            currentElement = s.charAt(i);
            if (currentElement==' ') continue;
            while (i < s.length()-1 && s.charAt(i+1)== ' '){
               i++;
            }
            nextElement = s.charAt(i+1);
            if (Character.isDigit(currentElement) && Character.isDigit(nextElement)){
                temp = currentElement +""+ nextElement;
            }
// 1 2 9 8 9 8 9  + 3
// c n
            if (Character.isDigit(currentElement)){
                ans.push(currentElement-'0');
            } else if (currentElement == '*') {
                ans.push(ans.pop()*(nextElement-'0'));
            } else if (currentElement == '/') {
                ans.push(ans.pop()/(nextElement-'0'));
            } else if (currentElement == '-') {
               ans.push(-(nextElement-'0'));
               i++;
            }
        }
        // 1 - 2 + 3 * 4 / 6
        int finalAns = 0;
        while (!ans.isEmpty()){
            finalAns += ans.pop();
        }
        return finalAns;
    }

    static void main(String[] args) {
        System.out.println(calculate(" 3+5 / 2 "));
    }
}