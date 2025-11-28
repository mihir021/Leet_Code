//import java.util.ArrayList;
//
//class Solution3495 {
//    public static long minOperations(int[][] queries) {
//        long ans = 0;
//        for (int[] query : queries) {
//            ans += fx(query[1]) - fx(query[0] - 1); // FIXED
//        }
//        return (ans + 1) / 2;
//    }
//
//    static long fx(long x) {
//        if (x <= 0) return 0; // FIXED
//
//        long sum = 0;
//        long limit = (long) (Math.log(x) / Math.log(4));
//
//        // FIXED loop
//        for (int i = 1; i <= limit; i++) {
//            long start = (long)Math.pow(4, i - 1);
//            long end   = (long)Math.pow(4, i) - 1;
//            long count = end - start + 1;
//            sum += (long)i * count;
//        }
//
//        long start = (long)Math.pow(4, limit);
//        sum += ((limit + 1) * (x - start + 1));
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[][] a = {{1, 8}};
//        System.out.println(minOperations(a)); // ✅ 7
//    }
//}
