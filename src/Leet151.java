class Solution151 {
    public String reverseWords(String s) {
        String [] ans = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = ans.length-1; i>=0; i--){
            if(ans[i]!=""){
                sb.append(ans[i]+" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}