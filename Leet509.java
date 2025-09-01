class Solution509 {
    int a = 1;
    int b = 1;
    int c = 0;
    // f(n) --> 1,1,2,3,5,8,13......
    public int fib(int n) {
        int i = 2;
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2 ){
            return 1;
        }
        while (i != n){
            c = a + b;  // 2
            a = b;      // 1
            b = c;      // 2
            i++;
        }
        return c;
    }
}