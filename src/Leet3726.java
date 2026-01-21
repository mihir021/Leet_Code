class Solution3526 {
    public long removeZeros(long n) {
        long ans = 0;
        int r;
        int i = 1;
        while (n > 0){
            r = (int)n % 10;
            if(r == 0) {
                n /= 10;
                continue;
            }
            ans = i*ans + ans;
            n /= 10;
            i*=10;
        }
        return ans;
    }
}