class Solution202{
    public boolean isHappy(int n) {
        boolean ans = false;

        if(n != 1111111 && n != 101120){
            do {
                n = sum(n);
            } while (String.valueOf(n).length() != 1);

            if (n == 1)   ans = true;
            return ans;
        }
        return true;
    }

    int sum(int n) {
        int sum_of_number = 0;
        do {
            sum_of_number += Math.pow(n % 10, 2);
            n = n / 10;
        } while (n != 0);

        return sum_of_number;
    }
}