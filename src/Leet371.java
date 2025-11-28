class Solution371 {
    public int getSum(int a, int b) {
        while(b != 0){
            int f = a & b;
            a = a ^ b;
            b = f << 1;
        }
        return a;
    }
}