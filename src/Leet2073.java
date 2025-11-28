class Solution2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int i = -1;
        int count = 0;
        int size = tickets.length;
        while(tickets[k]!=0){
            i++;
            if(tickets[i%size]==0) continue;
            tickets[i%size] = tickets[(i%size)]-1;
            count++;
        }
        return count;
    }
}