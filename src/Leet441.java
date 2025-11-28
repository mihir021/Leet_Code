class Solution441 {
        int arrangeCoins(int n) {
            if(n==1 || n==2) return 1;
            long low = 0;
            long high = n;
            long mid;
            long range = 0;
            while (low<=high){
                mid = (low+high)/2;
                range = (mid*(mid+1))/2;
                if(range==n) return (int)mid;
                if(range<n){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return (int)high;
        }

    public int arrangeCoins1(int n) {
        return (int)(-1 + Math.sqrt(1 + 8L *n))/2;
    }

    /**
     *     n1(n1+1)/2 <= n
     *     n1^2 + n1 -2n <= 0
     *     n1 = -1 + root (1+ 8n)/2
     */
}