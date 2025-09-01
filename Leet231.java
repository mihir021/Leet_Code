class Solution231 {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0)   return false;
        if(n==1) return true;

        for(int i=0 ; i<=n ; i++){
            if(n == Math.pow(2,i)) return true;
            if(n < Math.pow(2,i)) return false;
        }

        return false;
    }
}