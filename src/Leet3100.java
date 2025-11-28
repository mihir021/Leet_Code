class Solution3100 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int emptyBottles = numBottles;

        while (numBottles>0 || numExchange<=emptyBottles){
            emptyBottles -= numExchange;
            numExchange++;
            ans++;
            emptyBottles++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(10,3));
    }
}