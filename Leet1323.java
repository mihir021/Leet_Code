class Solution1323 {
    public int maximum69Number (int num) {
        int rem = 0;
        int temp = num;
        int y = 0;
        int m = 1;
        while (temp>0){
            // 9669
            rem = temp%10;
            if (rem == 6) {
                y = 3*m;
            }
            m = m*10;
            temp = temp/10;
        }
        return num+y;
    }
}