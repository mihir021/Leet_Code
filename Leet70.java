class Solution70 {
    int a = 1;int b = 2;int c = 3;
    public int climbStairs(int n) {
        int fix = 0;
        if(n==1) return 1;   if(n==2) return 2;   if(n==3) return 3;
        do {
            a=b;  b=c;   c=a+b;
        }while ((++fix+3) != n);
        return c;
    }
}
