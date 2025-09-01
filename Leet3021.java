class Solution3021 {
    public long flowerGame(int n, int m) {
        if(n==1 && m==1) return 0;
        int n1,n2,m1,m2;
        n1 = n-(n/2);
        n2 = n/2;
        m1 = m-(m/2);
        m2 = m/2;
        return (((long) n1 *m2)+((long) n2 *m1));
    }
}