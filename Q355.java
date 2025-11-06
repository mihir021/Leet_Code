class Solution355 {
    public int countEven(int num) {
        int ans = 0;
        while (num > 0){
            if(isEven(num)){
                ans++;
            }
            num--;
        }
        return ans;
    }

    boolean isEven(int n){
        int sum = 0;
        while(n > 0){
            sum += n;
            n--;
        }
        return sum % 2 ==0;
    }

    public static void main(String[] args) {
        Solution355 obj = new Solution355();
        obj.countEven(13);
    }
}