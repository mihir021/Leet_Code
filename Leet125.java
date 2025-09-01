class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(((s.charAt(i)) >= 'a' &&  (s.charAt(i)) <= 'z') || ((s.charAt(i)) >= '0' &&  (s.charAt(i)) <= '9') ) {
                s1.append(s.charAt(i));
            }
        }
        for(int i = 0 ; i < (s1.length()/2)  ; i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-i -1)){
                return false;
            }
        }
        return true;
    }
}