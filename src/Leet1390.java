class Solution1390 {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            int count = 2;          // {1, n}
            int sumTemp = 1 + n;    // include them
            int temp = 2;           // start from 2

            if(n <= 5){
                continue;
            }

            while (temp * temp <= n && count <= 4) {
                if (n % temp == 0) {
                    int other = n / temp;

                    if (temp == other) {
                        count += 1;
                        sumTemp += temp;
                    } else {
                        count += 2;
                        sumTemp += temp + other;
                    }
                }
                temp++;
            }

            if (count == 4) {
                sum += sumTemp;
            }
        }
        return sum;
    }

    static void main(String[] args) {
        sumFourDivisors(new int[]{21,4,7});

    }
}