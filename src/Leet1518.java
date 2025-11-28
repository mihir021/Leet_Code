class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int emptyBottles = 0;

        while (numBottles>0 && numExchange>emptyBottles){
            ans += numBottles;
            emptyBottles += (numBottles%numExchange);
            numBottles /= numExchange;
            if(emptyBottles>=numExchange) {
                ans += (emptyBottles = (emptyBottles / numExchange));
            }
        }
        return ans;
    }
}