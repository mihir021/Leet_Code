class Solution258 {
    public int addDigits(int num) {
        int ans = num;
        do{
            ans = m1(ans);
        }while (ans >= 10);
        return  ans;
    }
    int m1(int n){
        int r = 0;
        do{
            r += n % 10;
            n /= 10;
        }while ( n > 0);
        return r;
    }
}