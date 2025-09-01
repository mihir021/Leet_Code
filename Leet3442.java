class Solution3442 {
    public int maxDifference(String s) {
        int odd_f_max = 0;
        int even_f_min = Integer.MAX_VALUE;
        String s_new;
        int diff;
        while (!s.isEmpty()){
            s_new = s;
            s = s.replaceAll(s.charAt(0)+"","");
            diff = s_new.length() - s.length();
            if(diff % 2 == 0){
                if(even_f_min > diff){
                    even_f_min = diff;
                }
            }else {
                if(odd_f_max < diff )   odd_f_max = diff;
            }
        }
        return odd_f_max - even_f_min;
    }
}