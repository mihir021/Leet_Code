class Solution2264 {
    public String largestGoodInteger(String num) {
        String ans = "";
        String temp = "";
        for(int i = 0 ; i < (num.length()-2) ; i++){
            if((num.charAt(i)==num.charAt(i+1)) && (num.charAt(i)==num.charAt(i+2))){
                temp = num.substring(i,i+3);
                if(ans.isEmpty()){
                    ans = temp;
                    continue;
                }
                ans = String.valueOf(Math.max(Integer.parseInt(temp),Integer.parseInt(ans)));
            }
        }
        if(ans.equals("0")){
            return "000";
        }
        return ans;
    }
}