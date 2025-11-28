import java.util.Arrays;

class SolutionQ1 {
    public static int[] decimalRepresentation(int n) {
        int c = 0;
        int temp = n;
        while (temp > 0){
            if(temp % 10 != 0){
                c++;
            }
            temp /= 10;
        }
        int[] ans = new int[c];
        while (n > 0){
            if(n % 10 != 0){
                ans[--c] = n % 10 *((int)Math.pow(10,temp));
            }
            n /= 10;
            temp++;
        }
        return ans;
    }

    public static void main(String[] args) {
       int a[] = decimalRepresentation(102);
        System.out.println(Arrays.toString(Arrays.stream(a).toArray()));
    }
}
// 537 --> [500,30,7]
// 102 --> [100,2]