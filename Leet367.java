class Solution367 {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        int ans1 = (int)ans;

        if(ans1 == ans) return true;
        else return false;
    }
}