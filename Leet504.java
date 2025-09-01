class Solution504 {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        boolean fix = num < 0;
        if(fix) num = -num;

        while (num > 0){
            ans.insert(0, num % 7);
            num /= 7;
        }
        if(fix){
            return ans.insert(0, "-").toString();
        }
        return ans.toString();
    }
}