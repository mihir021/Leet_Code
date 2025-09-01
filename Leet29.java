class Solution29 {
    public int divide(int dividend, int divisor) {
        int ans = 0;
        if(dividend != -2147483648 || divisor != -1){
            ans = dividend/divisor;
        }else{
            ans = 2147483647;
        }
        return ans;

    }// -2147483648
}