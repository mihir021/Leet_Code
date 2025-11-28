class Solution3423 {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < (s.length()) ; i++){
            if((s.charAt(i) >= '0' && (s.charAt(i) <= '9'))){
                if(!sb.isEmpty())   sb.deleteCharAt(sb.length()-1);
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}