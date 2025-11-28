class Solution3461 {
    /*
    * Example 1:
        Input: s = "3902"
        Output: true
    Explanation:

    Initially, s = "3902"
    First operation:
    (s[0] + s[1]) % 10 = (3 + 9) % 10 = 2
    (s[1] + s[2]) % 10 = (9 + 0) % 10 = 9
    (s[2] + s[3]) % 10 = (0 + 2) % 10 = 2
        s becomes "292"
    Second operation:
    (s[0] + s[1]) % 10 = (2 + 9) % 10 = 1
    (s[1] + s[2]) % 10 = (9 + 2) % 10 = 1
        s becomes "11"
        Since the digits in "11" are the same, the output is true.
    *
    * */
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder();
        while (s.length() > 2){
            for(int i = 0 ; i < s.length() ; i++){
                sb.append((Integer.parseInt(s.charAt(i) + "") + Integer.parseInt(s.charAt(i+1) + ""))%10);
            }
            s = sb.toString();
            sb = new StringBuilder();
        }
        return s.length() == 2 && s.charAt(0) == s.charAt(1);
    }
}