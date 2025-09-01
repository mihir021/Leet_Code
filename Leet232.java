class MyQueue232 {

    int top;
    int[] queue;
    int[] queue2;
    int size;
    int i;

    public MyQueue232() {
        top = -1;
        size = 10;
        i = 0;
        queue = new int[size];
        queue2 = new int[size];
    }

    public void push(int x) {

        if(top==size-1){
            return;
        }
        top++;
        queue[top] = x;
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        else{
            int ans = queue[0];
            int loop = top;
            if(top==0){
                top = -1;
                queue[0] = 0;
                return ans;
            }
            if(top==1){
                top--;
                queue[0] = queue[1];
                queue[1] = 0;
                return ans;
            }
            top=-1;
            for(int i = 1; i<loop+1; i++){
                push(queue[i]);
            }
            queue[top+1] = 0;
            return ans;

        }
    }

    public int peek() {

        if(top==-1){
            return -1;
        }
        else{
            return queue[0];
        }
    }

    public boolean empty() {

        if(top==-1) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */