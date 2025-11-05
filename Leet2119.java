class Solution2119 {
    public static boolean isSameAfterReversals(int num) {
//        int a = num;
//        int rev = 0;
//        while (num>0){
//            rev = rev*10 + num%10;
//            num /= 10;
//        }
//        num = rev;
//        rev = 0;
//        while (num>0){
//            rev = rev*10 + num%10;
//            num /= 10;
//        }
//        return a == rev;
        if (num == 0)
            return true;
        return num%10 != 0;    }

    public static void main(String[] args) {
        isSameAfterReversals(526);
    }
}