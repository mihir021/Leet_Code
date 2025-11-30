import java.util.Stack;

class StockSpanner {

    Stack<int[]> st1;
    public StockSpanner() {
        st1 = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while(!st1.isEmpty() && st1.peek()[0]<=price){
            span += st1.pop()[1];
        }
        st1.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */