class Solution1716 {
    public int totalMoney(int n) {
        int totalCoins = 0;
        int numberOfWeek = 0;
        int i = 1;
        while (n-- > 0){
            if(i > 7){
                numberOfWeek++;
                i = 0;
            }
            totalCoins += (i + numberOfWeek);
            i++;
        }
        return totalCoins;
    }
}
